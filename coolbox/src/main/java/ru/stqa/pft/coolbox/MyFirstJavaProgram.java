package ru.stqa.pft.coolbox;

public class MyFirstJavaProgram {


    public static void main(String[] args) {
       hello("world");
        hello("user");
        hello("Ivan");

        Square s = new Square(5);
        System.out.println("Area square with side " + s.l + " = " + s.area());

       Rectangle r = new Rectangle(4, 6);
        System.out.println("Area rectangle with side " + r.a + " & "+ r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello; " + somebody + "!");
    }


}


