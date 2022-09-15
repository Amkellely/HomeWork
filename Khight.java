package OOP.Java;

import java.util.Random;

public class Khight extends Warrior{
    public int getDamage(){
        Random gen = new Random();
        int chance = gen.nextInt(10000);
        if(chance < 1000)
        return super.getDamage()* 2;
        else
            return super.getDamage();
    }
}
