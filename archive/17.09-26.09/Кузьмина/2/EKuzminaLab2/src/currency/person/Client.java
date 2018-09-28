package currency.person;

import java.util.Date;

// клиент
public class Client extends Person {

    // объявляем поля
    private String fio; // фио
    private Date birthday; // дата рождения
    private DUL document; // подтверждающий документ

    // объявляем конструктор
    public Client (String fio, Date birthday, DUL document){
        super(fio);
        this.birthday = birthday;
        this.document = document;
    }

    // возвр знач
    public DUL getDocument(){
        return document;
    }
}
