package stubs;

import person.Client;
import person.PersonDocument;

public class ClientStub extends Client {
    public ClientStub() {
        /**
         * Инициализация клиента - заглушка
         */
        PersonDocument dul = new PersonDocument();
        initDUL(dul);
        this.setDul(dul);
        this.setFirstName("Иван");
        this.setSecondName("Иванович");
        this.setSurname("Иванов");
        this.setId("0001");

    }

    private PersonDocument initDUL(PersonDocument dul) {
        /**
         * Инициализация ДУЛ клиента - заглушка
         */

        dul.setSeria("1111");
        dul.setNumber("000000");
        dul.setBeginDate("29.01.2000");
        return dul;
    }
}
