//Блок как область действия переменных
package Setter_java_2;

public class ScopeDemo {
    public static void main(String [] args) {

        int x; //переменная x видна во всем методе main{}

        x = 1;
        System.out.println("До вложенного блока: x равно " + x);
        {
            // новыйй блок создаёт новую область видимости

            /* переменная y доступна только внутри текущего
            блока, но это не мешает ее использованию вместе
                с переменной x внешнего блока
             */
            int y = 3;

            //здесь действуют обе переменных x и y
            System.out.println("Внутренний блок: x равно " +
                    x + ", y равно " + y);
            x = y * 3;
            }//конец вложенного блока






    }


}
