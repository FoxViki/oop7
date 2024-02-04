import java.util.logging.Logger;

public class Delenie implements Operation{

    @Override
    public double operate(double num1, double num2) {
        double rezult = 0;
        if (num2 == 0) {
            Logger.getAnonymousLogger().info("На ноль делить нельзя!");
        } else {
            rezult = num1 / num2;
            Logger.getAnonymousLogger().info("Выполняется деление");
            }
        return rezult;
    }
}