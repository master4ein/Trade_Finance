package ru.stqa.pft.coolbox;

public class CDdddd {


    public static void main(String[] args) {
        String[] wordListOne = {"афт", "перфекционизм", "новый", "джава", "жаба", "обсадный выигрыш",
                "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сити",
                "метод критического пути", "динамичный"};

        String[] wordListTwo = {"дом", "работа", "ялта", "бамбук", "рвань", "пупок",
                "вьетнам", "магазин", "дустер", "гелик", "бэха",
                "мак", "брак"};

        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"};

        // Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Генерируем три случайных числа
        int randl = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Теперь строим фразу
        String phrase = wordListOne[randl] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        // Выводим фразу на экран
        System.out.println("Bce, что нам нужно, - это " + phrase);



    }

}








