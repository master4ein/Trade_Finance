//пример использования нескольких экземпляров класса

package Setter_java_3;

class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}

class VehicleDemo {

    public static void main (String [] args) {

        Vehicle car1 = new Vehicle();
        car1.passengers = 2;
        car1.wheels = 4;
        car1.maxspeed = 250;
        car1.burnup = 18;

        Vehicle bus1 = new Vehicle();
        bus1.passengers = 22;
        bus1.wheels = 4;
        bus1.maxspeed = 150;
        bus1.burnup = 14;

        //расчет пути проходимого за 1.25 часа с макс. скоростью:
        double interal = 1.25;
        double distanceCar = car1.maxspeed * interal;
        double distanceBus = bus1.maxspeed * interal;

        System.out.print("car1 может проехать за 1 час 15 мин расстояние в ");
        System.out.print(distanceCar + " км с " + car1.passengers );
        System.out.println(" пассажирами.");

        System.out.print("bus1 может проехать за 1 час 15 мин расстояние в ");
        System.out.print(distanceBus + " км с " + bus1.passengers );
        System.out.println(" пассажирами.");


    }


}
