package noDesignPattern;

public class Payment {
    private String orderID;
    private String typePayment;

    public Payment(String orderID, String typePayment) {
        this.orderID = orderID;
        setTypePayment(typePayment);
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setTypePayment(String typePayment) {
        if(typePayment.equalsIgnoreCase("COD")) {
            this.typePayment = "COD";
            System.out.println("Payment by " + this.typePayment);
        } else if (typePayment.equalsIgnoreCase("Bank Transfer")) {
            this.typePayment = "Bank Transfer";
            System.out.println("Payment by " + this.typePayment);
        } else {
            System.out.println("Invalid payment method");
        }
    }
}
