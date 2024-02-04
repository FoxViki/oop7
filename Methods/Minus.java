package Methods;

import java.util.logging.Logger;

public class Minus implements Operation {

    @Override
    public double operate(double num1, double num2) {
        double result = num1 - num2;
        Logger.getAnonymousLogger().info("Выполняется вычитание");
        return result;
    }
}
