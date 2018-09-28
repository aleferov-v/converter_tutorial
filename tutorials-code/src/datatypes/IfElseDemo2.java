package datatypes;

public class IfElseDemo2 {
    public static void main(String[] args) {
        String cardType = "VISA";
        if ("VISA".equals(cardType)) {
            System.out.println("You pay with VISA");
        } else {
            System.out.println("Unknown card");
        }
        System.out.println("done");
    }
}
