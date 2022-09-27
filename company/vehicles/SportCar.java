package com.company.vehicles;


import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar {
    public class sportCar extends Car {
        private double speed;

        public sportCar(String carClass, String brend, Engine engine, Driver driver, double speed) {
            super(carClass, brend, engine, driver);
            this.speed = speed;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "sportCar{" +
                    "speed=" + speed +
                    '}';
             }
         }
    }

