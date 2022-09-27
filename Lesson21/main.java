package Lesson21;

public class main {
    public static void main(String[] args){
        final int size = 3;
        Student[] mas = new Student[size];
        Student s1 = new Student("Ivan", "Ivanon", 2121 , 4.5 );
        Student a1 = new Aspirant("Petro", "Ivanov", 22 , 5.0 );
        mas[0] = s1;
        mas[1] = a1;
        Student q1 = new Aspirant("Gregor", "Ivanov", 25 , 4.0 );
        System.out.println(q1.getScholarship());
        for(Student s:mas){
            System.out.println(s);
            System.out.println("grant = " + s.getScholarship());
        }
    }
}
