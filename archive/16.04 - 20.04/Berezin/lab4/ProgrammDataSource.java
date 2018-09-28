/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

/**
 *
 * @author siatl 
 */
public class ProgrammDataSource implements IDataSource {
    private ConvertionData data;
    ProgrammDataSource (Client client, double inputAmount,
                                    String inputCurrency,
                                    String resultCurrency){
        data=new ConvertionData(client, inputAmount, inputCurrency, resultCurrency);
    }
    public ConvertionData getConvertionData(){
        return data;
    }
}
