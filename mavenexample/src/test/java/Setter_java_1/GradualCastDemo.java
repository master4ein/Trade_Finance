//Приведение типов в выражениях

package Setter_java_1;

public class GradualCastDemo {

    public static void main(String [] args) {

        byte x,z;
        int y;

        x = 5;
        y = x * x;
        z = (byte) (x * x);
    }
}
