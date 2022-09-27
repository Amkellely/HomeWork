package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry {

    public class lorry extends Car{
        private double liftingCapacity;

        public lorry(String carClass, String brend, Engine engine, Driver driver, double liftingCapacity) {
            super(carClass, brend, engine, driver);
            this.liftingCapacity = liftingCapacity;
        }
        public double getLiftingCapacity(){
            return liftingCapacity;
        }
        public void setLiftingCapacity(double liftingCapacity) {
            this.liftingCapacity = liftingCapacity;
        }

        @Override
        public String toString() {
            return "lorry{" +
                    "liftingCapacity=" + liftingCapacity +
                    '}';
             }
          }
       }
