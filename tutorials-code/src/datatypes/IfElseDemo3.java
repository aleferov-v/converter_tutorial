package datatypes;

public class IfElseDemo3 {
    public static void main(String[] args) {
        String cardType = "MIR";
        if ("VISA".equals(cardType)) {
            System.out.println("You pay with VISA");
        } else if ("Mastercard".equals(cardType)) {
            System.out.println("You pay with Mastercard");
        } else if ("Mastercard1".equals(cardType)) {
            System.out.println("You pay with Mastercard");
        } else if ("Mastercard2".equals(cardType)) {
            System.out.println("You pay with Mastercard");
        } else if ("Mastercard3".equals(cardType)) {
            System.out.println("You pay with Mastercard");
        } else {
            System.out.println("Unknown card");
        }
        System.out.println("done");
    }
}
