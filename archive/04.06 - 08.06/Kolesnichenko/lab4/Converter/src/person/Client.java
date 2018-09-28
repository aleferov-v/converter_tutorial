package person;

public class Client extends Person {

    PersonDocument dul = new PersonDocument();

    public PersonDocument getDul() {
        return dul;
    }

    public void setDul(PersonDocument dul) {
        this.dul = dul;
    }


}
