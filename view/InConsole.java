package view;
import Deistvie.Calculation;

import static java.lang.System.*;

public class InConsole {
    public void viewResult(double num1, double num2, String operator){
        out.println(Calculation.calculation(num1, num2, operator));
    }
}
