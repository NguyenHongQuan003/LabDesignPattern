package statePattern;

public class BankTransfer implements State{
    @Override
    public void handleRequest() {
        System.out.println("Payment by Bank Transfer");
    }
}
