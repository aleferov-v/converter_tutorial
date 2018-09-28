/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework.ponomariev.lab3;

public class Operator extends Person {

    private String fio;

    public Operator(int id,String fio){
        this.id=id;
        this.fio=fio;
    }

    public boolean checkClientExisting(Client client) {
        return client != null;
    }

    public boolean checkDocument(Client client) {
        return checkClientExisting(client) && client.getExistDocument();
    }

    public ConversationRequest createConversionRequest(Client client,
                                                       String inputCurrency,
                                                       double inputAmount,
                                                       String resultCurrency,
                                                       double rate) {
        ConversationRequest returnValue = null;
        if (DataBase.isAllowableCurrency(inputCurrency)
                &&
           DataBase.isAllowableCurrency(resultCurrency)) {
        
        returnValue = new ConversationRequest();
        returnValue.setClient(client);
        returnValue.setInputAmount(inputAmount);
        returnValue.setInputCurrency(inputCurrency);
        returnValue.setResultCurrency(resultCurrency);
        returnValue.setRate(rate);
        }
        return returnValue;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fio
     */
    public String getFio() {
        return fio;
    }

    /**
     * @param fio the fio to set
     */
    public void setFio(String fio) {
        this.fio = fio;
    }
}

