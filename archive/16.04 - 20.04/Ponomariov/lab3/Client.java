/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework.ponomariev.lab3;


public class Client extends Person {

    private final String fio;
    private boolean isExistDocument;

    public Client(int id, String fio, boolean isExistDocument) {
        this.id = id;
        this.fio = fio;
        this.isExistDocument = isExistDocument;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public Boolean getExistDocument() {
        return isExistDocument;
    }

    public void setExistDocument(boolean existDocument) {
        isExistDocument = existDocument;
    }
}
