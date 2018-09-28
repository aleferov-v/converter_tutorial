package person;

import java.util.Date;

/**
 * Class describes client
 */
public class Client extends Person {

    private String fio;
    private Date birthdate;
    private DUL document;

    public Client(String fio, Date birthdate, DUL document) {
        super(fio);
        this.birthdate = birthdate;
        this.document = document;
    }

    public DUL getDocument() {
        return document;
    }
}
