package database;

import java.io.*;

public interface Parser {


    Object[] parse(String data) throws Exception;
}
