package main.java.ex4;

public class Person {
    private final String name;
    private final Date birth;

     public Person (String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName () {
        return this.name;
    }

    public Date getBirth () {
        return this.birth;
    }
}
