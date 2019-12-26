package Setter_java_1;

public class SwitchDemo {

    public  static void main (String [] args) {

        for (int x = 1; x <= 13; x++) {
            switch (x) {
                case 1: case 2: case 12:
                    System.out.println(x + ": зима");
                    break;
            }
        }
    }
}
