package main.java.ex10;

public class Main {
    public static void main (String[] args) {
        Person p1 = new Student();
        //Person p2 = new Person();     ERRORE
        Person p3 = new Teacher();
        Student p4 = new Student();
        //Student p5 = new Teacher();      ERRORE
        Lecture lec1 = new Lecture();
        Lecture lec2 = new OnlineLecture();
        OnlineLecture lec3 = new OnlineLecture();

        lec1.addAttendant (p1);
        //lec1.addAttendant (p2);       ERRORE
        lec1.addAttendant (p3);
        lec1.addAttendant (p4);
        //lec1.addAttendant (p5);        ERRORE
        lec2.addAttendant (p1);
        //lec2.addAttendant (p2);        ERRORE
        lec2.addAttendant (p3);
        lec2.addAttendant (p4);
        //lec2.addAttendant (p5);        ERRORE
        lec3.addAttendant (p1);
        //lec3.addAttendant (p2);        ERRORE
        lec3.addAttendant (p3);
        lec3.addAttendant (p4);
        //lec3.addAttendant (p5);        ERRORE
    }
}

abstract class Person {
    public void join (Lecture lec) {
        System.out.println ("Joining " + lec);
    }
    public void join (OnlineLecture lec) {
        System.out.println ("Joining " + lec);
    }
}
class Student extends Person {
    public void join (Lecture lec) {
        System.out.println ("Student joining " + lec); }
}
class Teacher extends Person {
    public void join (OnlineLecture lec) {
        System.out.println ("Teacher joining " + lec);
    }
}
class Lecture {
    public void addAttendant (Person p) {
        p.join (this);
    }

    public String toString() {
        return "a lecture";
    }
}
class OnlineLecture extends Lecture {
    public String toString () {
        return "An online lecture";
    }
}

