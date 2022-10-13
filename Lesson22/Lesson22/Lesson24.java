package Lesson22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lesson24 {
    public static void main(String[] args)  {
        //без джейнерика
        List listAnimal = new ArrayList();
        listAnimal.add("Cat");
        listAnimal.add("Dog");
        listAnimal.add("Horse");
        String firstAnimal = (String)listAnimal.get(0);
        System.out.println(firstAnimal);
        //с джейнериком
        List<String> listAnimal1 = new ArrayList<>();
        listAnimal1.add("Cat1");
        listAnimal1.add("Dog1");
        listAnimal1.add("Horse1");
        String firstAnimal1 = (String)listAnimal.get(0);
        System.out.println(firstAnimal1);

     /*   Mage mage = new Mage();
        mage.Cast();
        mage.move();
        mage.Hit();*/
    }
}
//ходить
interface canMove{
    void move();
}
//летать
//бить
interface canHit{
    void Hit();
}
//стрелять
//колдовать
interface canCast{
    void Cast();
}
//маг - ходить, бить, колдовать
class Mag implements canCast, canHit, canMove{
    @Override
    public void Cast(){
        System.out.println("Mage casting");
    }
    @Override
    public void Hit(){
        System.out.println("Mage hitting ");
    }
    @Override
    public void move(){
        System.out.println("Mage moving");
    }
}