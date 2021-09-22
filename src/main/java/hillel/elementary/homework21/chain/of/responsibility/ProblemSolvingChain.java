package hillel.elementary.homework21.chain.of.responsibility;

import hillel.elementary.homework21.chain.of.responsibility.service.ProblemSolvingService;

public class ProblemSolvingChain implements EmailProcessingChain {
    private EmailProcessingChain nextChain;
    private ProblemSolvingService problemSolvingService;

    public ProblemSolvingChain(ProblemSolvingService problemSolvingService) {
        this.problemSolvingService = problemSolvingService;
    }

    public ProblemSolvingService getProblemSolvingService() {
        return problemSolvingService;
    }

    public void setProblemSolvingService(ProblemSolvingService problemSolvingService) {
        this.problemSolvingService = problemSolvingService;
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
        if (emailText.contains("help") || emailText.contains("problem")) {
            this.problemSolvingService.takeRequest();
        } else if (nextChain != null) {
            nextChain.handleRequest(emailText);
        } else {
            throw new NullPointerException("Problem with the text,send email once again");
        }
    }
}
