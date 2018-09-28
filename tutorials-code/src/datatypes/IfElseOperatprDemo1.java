package datatypes;

public class IfElseOperatprDemo1 {
    public static void main(String[] args) {
        String cardType = "VISA";
        String result = cardType.equals("VISA") ? "You pay with VISA" : "Unknown card";
        System.out.println(result);
    }
}
