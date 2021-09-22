package hillel.elementary.homework21.chain.of.responsibility;

public interface EmailProcessingChain {
    void setNextChain(EmailProcessingChain nextChain);
    void handleRequest(String emailText) throws NullPointerException;
}
