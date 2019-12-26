//Переменные логического типа

package Setter_java_1;

public class BollDemo {
    public static void main(String [] Args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно "+ b);

        if (b) System.out.println("Как вы думаете увидите ли вы эту строку?");

        System.out.println("Выражение 10 > 9 имеет значение " + (10 > 9));
    }
}
