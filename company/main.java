package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class main {
    public static void main(String[] args) {
        Engine e1= new Engine(150, "BMW" );
        Driver d1 = new Driver("Vasia Pupkov", 45, 25);
        Car c1= new Car("lorry", "Volvo", e1, d1);
        System.out.println(c1);
    }
}
