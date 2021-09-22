package hillel.elementary.homework21.chain.of.responsibility;

import hillel.elementary.homework21.chain.of.responsibility.service.FeedbackOperatingService;

public class FeedbackChain implements EmailProcessingChain {
    private EmailProcessingChain nextChain;
    private FeedbackOperatingService feedbackOperatingService;

    public FeedbackChain(FeedbackOperatingService feedbackOperatingService) {
        this.feedbackOperatingService = feedbackOperatingService;
    }

    public EmailProcessingChain getNextChain() {
        return nextChain;
    }

    public FeedbackOperatingService getFeedbackOperatingService() {
        return feedbackOperatingService;
    }

    public void setFeedbackOperatingService(FeedbackOperatingService feedbackOperatingService) {
        this.feedbackOperatingService = feedbackOperatingService;
    }

    @Override
    public void setNextChain(EmailProcessingChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(String emailText) throws NullPointerException {
        if (emailText.contains("thanks") || emailText.contains("complain")) {
            this.feedbackOperatingService.takeRequest();
        } else if (nextChain != null) {
            nextChain.handleRequest(emailText);
        } else {
            throw new NullPointerException("No letters in the text,send email once again");
        }
    }
}
