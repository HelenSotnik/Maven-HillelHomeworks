package hillel.elementary.homework21.chain.of.responsibility;

import hillel.elementary.homework21.chain.of.responsibility.service.SpamBoxService;

public class SpamChain implements EmailProcessingChain {
    private EmailProcessingChain nextChain;
    private SpamBoxService spamBox;

    public SpamChain(SpamBoxService spamBox) {
        this.spamBox = spamBox;
    }

    public SpamBoxService getSpamBox() {
        return spamBox;
    }

    public void setSpamBox(SpamBoxService spamBox) {
        this.spamBox = spamBox;
    }

    public EmailProcessingChain getNextChain() {
        return nextChain;
    }

    @Override
    public void setNextChain(EmailProcessingChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(String emailText) throws NullPointerException {
        if (emailText.contains("advertising")) {
            this.spamBox.takeRequest();
        } else if (nextChain != null) {
            nextChain.handleRequest(emailText);
        } else {
            throw new NullPointerException("Problem with the text,send email once again");
        }
    }
}
