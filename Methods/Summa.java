package Methods;

import java.util.logging.Logger;

public class Summa implements Operation{
    @Override
    public double operate(double num1, double num2) {
        double v = num1 + num2;
        Logger.getAnonymousLogger().info("Выполняется сложение");
        return v;

    }
}
