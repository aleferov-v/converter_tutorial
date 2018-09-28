package datatypes;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        String cardType = "VISA";
        switch (cardType) {
            case "VISA":
            case "Mastercard":
            case "Mastercard2":
                System.out.println("You pay with Mastercard");
            case "Mastercard3":
                System.out.println("You pay with Mastercard");
                break;
            default:
                System.out.println("Unknown card");
        }
        System.out.println("done");
    }
}
