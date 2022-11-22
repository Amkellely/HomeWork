package Lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarTest {
    public static void filterCars(List<Car> cars, Predicate<Car> predicate, Consumer<Car> consumer) {
                for(Car car : cars){
                    if(predicate.test(car)){
                        consumer.accept(car);
                    }
                }
    }

    public static void main(String[] args) {
        Car car1 = new Car(Car.Body.CUPE, 200);
        Car car2 = new Car(Car.Body.SEDAN, 150);
        Car car5 = new Car(Car.Body.SEDAN, 125);
        Car car6 = new Car(Car.Body.SEDAN, 140);
        Car car3 = new Car(Car.Body.HATCHBACK, 284);
        Car car4 = new Car(Car.Body.HATCHBACK, 280);
        Car car7 = new Car(Car.Body.SEDAN, 200);
        Car car8 = new Car(Car.Body.HATCHBACK, 290);

        List<Car> carList = Arrays.asList(car1,car2,car3);
        /*filterCars(carList, (Car car)->{return car.getPower() >=200;}, (Car car)->{
            System.out.println(car);}); */

        List<Car> carList1 = Arrays.asList(car2,car5,car6,car7);
        filterCars(carList, (Car car)->{return car.getPower() <=200;}, (Car car)->{
            System.out.println(carList1);});

        List<Car> carList2 = Arrays.asList(car3,car4,car8);
        filterCars(carList, (Car car)->{return car.getPower() >=200;}, (Car car)->{
            System.out.println(carList2);});

    }
}
