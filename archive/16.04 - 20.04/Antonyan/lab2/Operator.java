/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

public class Operator extends Person {

    private int id;
    private String FIO;


    public int countRequest = 0;

    public boolean checkClientExisting(Client client) {
        return client != null;
    }



    public boolean checkDocument(Client client) {
        return checkClientExisting(client) && client.isExistDocument();
    }

    public Operator(int id) {
        for (int i = 0; i < DataBase.CASSIER[0].length; i++) {
            if (id == Integer.parseInt(DataBase.CASSIER[0][i])) {
                this.id = Integer.parseInt(DataBase.CASSIER[0][i]);
                this.FIO = DataBase.CASSIER[1][i];
                break;
            }
        }
    }

    public ConversationRequest createConversionRequest(Client client,
                                                       String inputCurrency,
                                                       double inputAmount,
                                                       String resultCurrency,
                                                       double rate) {
        ConversationRequest returnValue = new ConversationRequest();
        returnValue.setClient(client);
        returnValue.setInputAmount(inputAmount);
        returnValue.setInputCurrency(inputCurrency);
        returnValue.setResultCurrency(resultCurrency);
        returnValue.setRate(rate);

        countRequest++;

        return returnValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }


}


