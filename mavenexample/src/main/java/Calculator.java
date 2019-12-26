import ru.parsentev.calculator.ICalculator;

public class Calculator {
    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }
        public static class CalcExecutor {
        public static void main(String [] args) {
            final Calculator calculator = new Calculator();
            calculator.add(Double.valueOf(args[0]), Double.valueOf(args[0]));

        }


    }
}
