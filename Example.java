package com.tka.april13;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Player> csk = new ArrayList<>();
        List<Player> mi = new ArrayList<>();
        List<Player> delhi = new ArrayList<>();

        //  CSK
        csk.add(new Player(1, "Ruturaj", 2000, 0));
        csk.add(new Player(2, "Dhoni", 1500, 5));
        csk.add(new Player(3, "Jadeja", 1800, 30));
        csk.add(new Player(4, "Conway", 900, 0));
        csk.add(new Player(5, "Moeen", 1200, 25));
        csk.add(new Player(6, "Gaikwad", 1050, 0));
        csk.add(new Player(7, "Deepak", 400, 35));
        csk.add(new Player(8, "Chahar", 100, 45));
        csk.add(new Player(9, "Pathirana", 80, 50));
        csk.add(new Player(10, "Shivam", 600, 10));

        //  MI
        mi.add(new Player(11, "Rohit", 3000, 2));
        mi.add(new Player(12, "Ishan", 2200, 1));
        mi.add(new Player(13, "Surya", 2500, 3));
        mi.add(new Player(14, "Hardik", 1400, 20));
        mi.add(new Player(15, "Pollard", 2300, 40));
        mi.add(new Player(16, "Bumrah", 200, 60));
        mi.add(new Player(17, "Tilak", 800, 10));
        mi.add(new Player(18, "Sky", 2100, 5));
        mi.add(new Player(19, "Arjun", 150, 25));
        mi.add(new Player(20, "Nehal", 900, 15));

        //  Delhi
        delhi.add(new Player(21, "Pant", 1900, 0));
        delhi.add(new Player(22, "Shaw", 1500, 0));
        delhi.add(new Player(23, "Warner", 3100, 0));
        delhi.add(new Player(24, "Axar", 1200, 30));
        delhi.add(new Player(25, "Nortje", 100, 45));
        delhi.add(new Player(26, "Kuldeep", 300, 50));
        delhi.add(new Player(27, "Lalit", 700, 10));
        delhi.add(new Player(28, "Ripal", 450, 5));
        delhi.add(new Player(29, "Prithvi", 1700, 0));
        delhi.add(new Player(30, "Aman", 600, 12));

      
        System.out.println("Players with Runs > 100");
        displayRunsGreaterThan100(csk, "CSK");
        displayRunsGreaterThan100(mi, "MI");
        displayRunsGreaterThan100(delhi, "Delhi");

        System.out.println("\n Players with Wickets < 20 ");
        displayWicketsLessThan20(csk, "CSK");
        displayWicketsLessThan20(mi, "MI");
        displayWicketsLessThan20(delhi, "Delhi");
    }

    public static void displayRunsGreaterThan100(List<Player> team, String teamName) {
        for (Player p : team) {
            if (p.getRuns() > 100) {
                System.out.println(teamName + " - " + p.getPname() + " | Runs: " + p.getRuns());
            }
        }
    }

    public static void displayWicketsLessThan20(List<Player> team, String teamName) {
        for (Player p : team) {
            if (p.getWickets() < 20) {
                System.out.println(teamName + " - " + p.getPname() + " | Wickets: " + p.getWickets());
            }
        }
    }
}
