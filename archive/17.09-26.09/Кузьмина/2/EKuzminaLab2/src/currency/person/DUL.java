package currency.person;

import java.util.Date;

// док-т, удостов личность
public class DUL {

    // доступно в рамках пакета
    String type; // тип док-та
    String seria; // серия
    String number; // номер
    String code; // код подразделения
    Date date; // дата выдачи

    // аннотация
    @Override
    public String toString() {
        return String.format("тип документа=%s, серия=%s, номер=%s, код подразделения=%s, дата выдачи=%s", type, seria, number, code, date.toString());
    }

    // модифицирующие методы, установливаем значения
    public void setType(String type) {
        this.type = type;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
