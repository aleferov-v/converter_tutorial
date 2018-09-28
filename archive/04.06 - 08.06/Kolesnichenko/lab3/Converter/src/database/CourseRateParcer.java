package database;

import system.NoFileToParceException;
import currency.*;


import java.io.*;

public class CourseRateParcer implements Parser {

    private File file;

    @Override
    /**
     * Парсер для данных по валюте из файла
     */
    public MoneyType[] parse(String data) throws NoFileToParceException {
/**
 * Данные, считанные из файла
 */
        String dataIn = data;
        int i=0;
        int count = 0;
        String whereIsDivider="";
        /*
        Сколько данных на выходе для создания массива подходящего размера
         */
        while (i<dataIn.length()){
            if (dataIn.charAt(i)=='|')
            {
                count++;
                whereIsDivider+=i;
            }
            i++;
        }

        MoneyType[] dataOut = new MoneyType[count];

        int begin =0;
        int end=0;
        i=0;
        String local = "";
        CourseRate rate = new CourseRate();
        while (i<whereIsDivider.length()){

            begin = (int)whereIsDivider.charAt(i);
            end = (int)whereIsDivider.charAt(i+1);

            local = dataIn.substring(begin,end);
             rate.setBuyPrice(Double.parseDouble(local.substring(0,local.indexOf(","))));
             local=local.substring(local.indexOf(",")+1, local.length());

             rate.setSellPrice(Double.parseDouble(local.substring(0,local.indexOf(","))));
            dataOut[i].setCourseRate(rate);
            i++;
        }

        return dataOut;

    }



}
