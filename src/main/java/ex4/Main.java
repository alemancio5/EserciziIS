package main.java.ex4;

public class Main {
    public static void main (String[] args) {
        try {
            Student A = new Student ("Alessandro Mancini", new Date (19, 12, 2001));
            A.insertExam (new Exam ("Reti Logiche", new Date (19, 1, 2022), 19));
            A.insertExam (new Exam ("Reti Applicative", new Date (22, 1, 2020), 18));
            A.printStudent();
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
    }
}