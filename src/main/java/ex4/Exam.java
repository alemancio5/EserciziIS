package main.java.ex4;

public class Exam {
    private final String name;
    private final Date date;
    private final int vote;

    public Exam (String name, Date date, int vote) throws Exception {
        this.name = name;
        this.date = date;
        if (vote >= 18 && vote <= 32) {
            this.vote = vote;
        } else {
            throw (new Exception ("Error: Vote " + vote + " is not valid"));
        }
    }

    public String getName () {
        return this.name;
    }

    public Date getDate () {
        return this.date;
    }

    public int getVote () {
        return this.vote;
    }
}
