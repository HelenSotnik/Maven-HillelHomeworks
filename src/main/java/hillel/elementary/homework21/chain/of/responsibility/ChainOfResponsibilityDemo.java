package hillel.elementary.homework21.chain.of.responsibility;

import hillel.elementary.homework21.chain.of.responsibility.service.FeedbackOperatingService;
import hillel.elementary.homework21.chain.of.responsibility.service.ProblemSolvingService;
import hillel.elementary.homework21.chain.of.responsibility.service.SpamBoxService;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) throws NullPointerException {

        EmailProcessingChain problemSolvingChain = new ProblemSolvingChain(new ProblemSolvingService());
        EmailProcessingChain spamChain = new SpamChain(new SpamBoxService());
        EmailProcessingChain feedbackChain = new FeedbackChain(new FeedbackOperatingService());

        problemSolvingChain.setNextChain(problemSolvingChain);
        problemSolvingChain.handleRequest("help");

        problemSolvingChain.setNextChain(spamChain);
        problemSolvingChain.handleRequest("advertising");

        problemSolvingChain.setNextChain(feedbackChain);
        problemSolvingChain.handleRequest("complain");
    }
}
