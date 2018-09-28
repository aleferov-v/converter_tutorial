package homework.ponomariev.lab3;

public class DataBase {

    private final static String[][] CLIENTS = {
            {"1", "2"},
            {"ИВАНОВ И.П.", "ПЕТРОВ И.В."},
            {"true", "false"}
    };

    private static final String[][] CASSIER = {
            {"1", "2"},
            {"РАППОПОРТ И.Г.", "МИХЕЛЬСОН П.Р."}
    };

    private static final String[][] COURSE_TO_RUB = {
            {"USD", "EUR", "RUB","CHF","GBP","CAD"},
            {"61.63", "76.15", "1","63.66","87.84","48.65"}
    };
    private static String[][] CASH_BOX_BALANCE={
            {"USD", "EUR", "RUB","CHF","GBP","CAD"},
            {"15000", "10000", "1000000","500","50","5000"}
    };
    
    public static boolean isAllowableCurrency(String currency){
        boolean returnValue=false;
        for (int i=0;i<DataBase.COURSE_TO_RUB[0].length;i++){
            if (currency.equals(DataBase.COURSE_TO_RUB[0][i])) {
                returnValue=true;
                break;
            }
        }        
        return returnValue;
    }
    
    
    public static double getRate_to_RUB(String currency){
        double returnValue=0.0;
        
        for (int i=0;i<DataBase.COURSE_TO_RUB[0].length;i++){
            if (currency.equals(DataBase.COURSE_TO_RUB[0][i])) {
                returnValue=Double.parseDouble(DataBase.COURSE_TO_RUB[1][i]);
                break;
            }
        }
        return(returnValue);
    }
    public static Client getClientById (int id){
        Client result=null;
        String fio = "";
        boolean isExistDocument = false;
        
        for (int i = 0; i < CLIENTS[0].length; i++) {
            if (id == Integer.parseInt(CLIENTS[0][i])) {
                fio = CLIENTS[1][i];
                isExistDocument = Boolean.parseBoolean(CLIENTS[2][i]);
                result = new Client(id, fio, isExistDocument);
                break;
            }
        }
        return result;
    }
    public static Operator getOperatorById(int id){
        Operator result=null;
        String fio="";
        
        for (int i = 0; i < CASSIER[0].length; i++) {
            if (id == Integer.parseInt(CASSIER[0][i])) {
                fio = CASSIER[1][i];
                result=new Operator(id,fio);
                break;
            }
        }
        return result;
    }
    public static double getBalanceCurrency(String currency){
        double result=0.0;
        for (int i = 0; i < CASH_BOX_BALANCE[0].length; i++) {
            if (currency.equals(CASH_BOX_BALANCE[0][i])) {
                result=Double.parseDouble(CASH_BOX_BALANCE[1][i]);
                break;
            }
        }        
        return result;
    }
    
    public static void BalanceUP(String currency, double operationAmount){
        double balanceCurrency;
        for (int i = 0; i < CASH_BOX_BALANCE[0].length; i++) {
            if (currency.equals(CASH_BOX_BALANCE[0][i])) {
                balanceCurrency=Double.parseDouble(CASH_BOX_BALANCE[1][i]);
                balanceCurrency+=operationAmount;
                CASH_BOX_BALANCE[1][i]= Double.toString(balanceCurrency);
                break;
            }
        }              
    }
    public static void BalanceDown(String currency, double operationAmount){
        double balanceCurrency;
        for (int i = 0; i < CASH_BOX_BALANCE[0].length; i++) {
            if (currency.equals(CASH_BOX_BALANCE[0][i])) {
                balanceCurrency=Double.parseDouble(CASH_BOX_BALANCE[1][i]);
                balanceCurrency-=operationAmount;
                CASH_BOX_BALANCE[1][i]= Double.toString(balanceCurrency);
                break;
            }
        }            
    }
}
