//приведение типов в выражениях
package Setter_java_2;

class GradleCastDemo {
    public static void main(String [] args) {

        byte x,z;
        int y;

        x = 5;
        y = x * x; // все правильно, результат по операции
                  // имеет тип int
        z = (byte) (x * x); // чтобы записать результат
                            // в переменную типа byte,
                            //  требуется явное преобразавоние
                            //  типа результата


    }
}
