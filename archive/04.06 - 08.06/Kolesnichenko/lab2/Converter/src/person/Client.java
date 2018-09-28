package person;

import person.Person;
import person.PersonDocument;

/**
 * Клиент который пришел в банк и хочет денег
 */
public class Client extends Person {

    /**
     *
     */
    private PersonDocument dul = new PersonDocument();

    public PersonDocument getDul() {
        return dul;
    }

    public void setDul(PersonDocument dul) {
        // Комментарий
        //
        this.dul = dul;
    }

}
