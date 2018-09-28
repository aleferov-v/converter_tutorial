package person;

public class Administrator extends Operator {
    private String password;

    public Administrator(String login, String vsp,  String password) {
        super(login, vsp);
        this.password = password;
    }
}
