import noDesignPattern.*;
import statePattern.BankTransfer;
import statePattern.COD;
import statePattern.PaymentContext;

public class Main {
    public static void main(String[] args) {
//        No design pattern
        Payment p = new Payment("123", "Bank Transfer");
        System.out.println("=====================================");
//        State pattern
        PaymentContext pc = new PaymentContext();
        pc.setState(new COD());
        pc.applyState();

        pc.setState(new BankTransfer());
        pc.applyState();
    }
}