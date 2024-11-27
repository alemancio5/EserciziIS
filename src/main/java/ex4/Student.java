package main.java.ex4;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Exam> exam = new ArrayList<Exam>();

    public Student (String name, Date birth) {
        super (name, birth);
    }

    public void insertExam (Exam exam) {
        this.exam.add (exam);
    }

    public void printExams () {
        for (int i = 0; i < this.exam.size(); i++) {
            System.out.println (this.exam.get(i).getName() + " " + this.exam.get(i).getDate().toString() + " " + this.exam.get(i).getVote());
        }
    }

    public void printStudent () {
        System.out.println (this.getName());
        System.out.println (this.getBirth().toString());
        this.printExams();
    }

    public Exam searchExam (String name) throws Exception {
        for (int i = 0; i < this.exam.size(); i++) {
            if (name.equals(this.exam.get(i).getName())) {
                return this.exam.get(i);
            }
        }
        throw (new Exception ("Error: Exam not found"));
    }
}
