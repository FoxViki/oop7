package Deistvie;

import DataMethods.Operation;
import Vybor.OperationSelect;

public class Calculation {
    public static double calculation(double num1, double num2, String operator){
        Operation operation = OperationSelect.operationSelect(operator);

        assert operation != null;
        return operation.operate(num1, num2);

    }
}
