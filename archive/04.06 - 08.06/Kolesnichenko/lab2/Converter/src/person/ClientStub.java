package person;

public class ClientStub extends Client {
    public ClientStub(){

        PersonDocument dul = initDUl();
        this.setDul(dul);

        this.setFirstName("Иван");
        this.setSecondName("Иванович");
        this.setSurname("Иванов");
    }

    private PersonDocument initDUl() {
        PersonDocument dul = new PersonDocument();

        dul.setSeria("1111");
        dul.setNumber("000000");
        dul.setBeginDate("29.01.2000");
        return dul;
    }
}
