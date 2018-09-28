package database;


import java.util.*;

/**
 * Абстрактный источник данных о валютах
 */
public abstract class DataSource {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String  path) {
        this.path = path;
    }
    /**
     * Получение данных из источника
     * Поменять на коллекцию
     */

    abstract Object createData(String path) throws Exception;






}
