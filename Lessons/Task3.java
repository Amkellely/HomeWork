package Lessons;

/*
Создайте класс Автомобиля. Он должен хранить
информацию о названии автомобиля, год выпуска, цена,
цвет, объем двигателя. Нужно создать набор автомобилей
и выполнить следующие задачи:
■ Показать все автомобили;
■ Показать все автомобили заданного цвета;
■ Показать все автомобили заданного объёма;
■ Показать все автомобили дороже заданной цены;
■ Показать все автомобили чей год выпуска находится
в указанном диапазоне.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;
import java.util.stream.Stream;

class Auto{
    private String marka;
    private int yearOfProd;
    private int price;
    private String color;
    private int volume;

    public Auto(String marka, int yearOfProd, int price, String color, int volume) {
        this.marka = marka;
        this.yearOfProd = yearOfProd;
        this.price = price;
        this.color = color;
        this.volume = volume;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
}
public class Task3 {
    public static void main(String[] args) {
        List<Auto> carList = new ArrayList<>();
        carList.add(new Auto("BMW X5", 2020,50000, "White", 2500));
        carList.add(new Auto("BMW X3", 2006,15000, "Red", 1500));
        carList.add(new Auto("KIA SportAge", 2016,25000, "White", 2200));
        carList.add(new Auto("Hundai SantaFe", 2020,280000, "Black", 2400));
        carList.add(new Auto("Lada Vesta", 2014,9500, "White", 14000));

        Stream<Auto> cars = carList.stream();
        System.out.print(carList);
        System.out.println();
        carList.stream().filter(x-> x.getColor()==("Black")).forEach(x -> System.out.println(x + " "));
        System.out.print(carList.stream().filter(x-> x.getColor().equals("Read"));
    }
}
