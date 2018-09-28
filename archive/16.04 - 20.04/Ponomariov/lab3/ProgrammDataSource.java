/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework.ponomariev.lab3;

/**
 *
 * @author siatl 
 */
public class ProgrammDataSource implements IDataSource {
    private ConvertionData data;
    ProgrammDataSource (double inputAmount,
                                    String inputCurrency,
                                    String resultCurrency){
        data=new ConvertionData(inputAmount, inputCurrency, resultCurrency);
    }
    public ConvertionData getConvertionData(){
        return data;
    }
}
