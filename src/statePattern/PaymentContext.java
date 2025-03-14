package statePattern;

public class PaymentContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void applyState() {
        state.handleRequest();
    }
}
