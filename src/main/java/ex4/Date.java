package main.java.ex4;

public class Date {
    private final int day;
    private final int month;
    private final int year;

    public Date (int day, int month, int year) throws Exception {
        if (month <= 12 && month > 0 && day <= 31 && day > 0 && year <= 2022 && year >= 1800) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw (new Exception ("Error: Date " + day + "/" + month + "/" + year + " is not valid"));
        }
    }

    public String toString () {
        return (this.day + "/" + this.month + "/" + this.year);
    }

    public int getDay () {
        return day;
    }

    public int getMonth () {
        return month;
    }

    public int getYear () {
        return year;
    }
}