package statePattern;

public class COD implements State{
    @Override
    public void handleRequest() {
        System.out.println("Payment by COD");
    }
}
