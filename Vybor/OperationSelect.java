package Vybor;



import Methods.Operation;
import Methods.Summa;
import Methods.Minus;
import Methods.Umnozh;
import Methods.Delenie;



import java.util.logging.Logger;

public class OperationSelect {
    public static Operation operationSelect(String operator){
        switch (operator){
            case "+":
                return new Summa();
            case "-":
                return new Minus();
            case "*":
                return new Umnozh();
            case "/":
                return new Delenie();
            default:
                Logger.getAnonymousLogger().info("Неверный оператор!");
        }

        return null;
    }
}