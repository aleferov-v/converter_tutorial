/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;


public class Client {

    private final int id;
    private final String fio;
    private boolean isExistDocument;

    private static boolean isExistDocument2 = true;

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("block");
    }

    public Client(int id, String fio, boolean isExistDocument) {
        System.out.println("constructor");
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

    public boolean isExistDocument() {
        return isExistDocument;
    }

    public void setExistDocument(boolean existDocument) {
        isExistDocument = existDocument;
    }

    public static boolean isIsExistDocument2() {
        return isExistDocument2;
    }

    public static void setIsExistDocument2(boolean isExistDocument2) {
        Client.isExistDocument2 = isExistDocument2;
    }
}
