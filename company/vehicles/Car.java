package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    protected String carClass;
    protected String brend;
    protected Engine engine;
    protected Driver driver;

    public Car(){}

    public Car(String carClass, String brend, Engine engine, Driver driver) {
        this.carClass = carClass;
        this.brend = brend;
        this.engine = engine;
        this.driver = driver;
    }

    public void start(){
        System.out.println( "Поехали");
    }
    public void stop(){
        System.out.println( "Останавливаемся");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }
    public void  turnRight() {
        System.out.println("Поворот направо");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", brend='" + brend + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
