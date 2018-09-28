package database;

import currency.MoneyType;
import system.*;

import java.io.*;

import java.util.*;

public class FileDataSource extends DataSource {

/**
 * Считываение данных из файла
 *
 */


    @Override
    public String createData(String path) throws Exception
    {
        if (path==null) throw new NoDataExeption("Невозможно получить данные: не указан путь");

        FileReader reader = new FileReader(path);
        Scanner scanner = new Scanner(reader);

       String data = "";

        while (scanner.hasNextLine()){

            data+=(scanner.nextLine()+"|");

        }
        reader.close();

        return data;
    }
}
