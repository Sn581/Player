package com.tka.april13;

public class Player {
    private int jerseyNumber;
    private String pname;
    private int runs;
    private int wickets;

    public Player(int jerseyNumber, String pname, int runs, int wickets) {
        this.jerseyNumber = jerseyNumber;
        this.pname = pname;
        this.runs = runs;
        this.wickets = wickets;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getPname() {
        return pname;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }
}

