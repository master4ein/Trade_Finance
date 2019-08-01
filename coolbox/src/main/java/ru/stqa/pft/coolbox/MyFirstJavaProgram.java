package ru.stqa.pft.coolbox;

public class MyFirstJavaProgram {


    public static void main(String[] args) {
       hello("world");
        hello("user");
        hello("Ivan");

        double l = 5;
        System.out.println("Area square with side " + l + " = " + area(l));

        double a = 4;
        double b = 5;
        System.out.println("Area rectangle with side " + a + " & "+ b + " = " + area(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello; " + somebody + "!");
    }

    public static double area(double len)  {
       return len * len;
    }

    public static double area (double a, double b) {
        return  a * b;
    }

}


