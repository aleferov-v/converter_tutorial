package database;

import system.NoDataExeption;

import java.io.IOException;

public class CourseRateExecuteProcessing {
    /**
     * Данные о валютных курсах из файла:
     * чтение данных
     * парсинг данных
     */

    public void CourseRateExecuteProcessing() {

        FileDataSource source = new FileDataSource();
        try {
            source.createData("./co1nverter/textFiles/courseRate_today.txt");

        } catch (IOException eio) {
            System.exit(1);
        } catch (NoDataExeption EnD) {
            System.exit(1);
        } catch (Exception e) {
            System.exit(1);
        }



    }

}