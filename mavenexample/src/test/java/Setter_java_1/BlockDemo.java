//Блоки
package Setter_java_1;

public class BlockDemo {

    public static void main(String [] args) {

        int long1, long2, long3, long4;

        long1 = 4096;
        long2 = long1/4;

        System.out.println("long1 = " + long1);
        System.out.println("long2 = long1 / 4 = " + long2);

        if (long1 > long2) {
            long3 = long1 +1000;
            System.out.println("long3 = " +  long3);
            long4 = long1 / long2 / long3;
            System.out.println("long4 = Сумма всех значений: " + long4);
        }
    }
}


