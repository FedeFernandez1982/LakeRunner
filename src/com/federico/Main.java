package com.federico;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Not much to comment, hard coding lots of data into my objects
        LakeTimes calhoun =  new LakeTimes("Calhoun", new ArrayList<String>());
        calhoun.addTime("45:10");
        calhoun.addTime("43:93");
        calhoun.addTime("52:10");
        calhoun.addTime("44:12");

        LakeTimes harriet = new LakeTimes("Harriet", new ArrayList<String>());
        harriet.addTime("44:43");
        harriet.addTime("46:22");

        LakeTimes como = new LakeTimes("Como", new ArrayList<String>());
        como.addTime("32:11");
        como.addTime("28:62");

        ArrayList <LakeTimes> lakesRun = new ArrayList<LakeTimes>();
        lakesRun.add(calhoun);
        lakesRun.add(harriet);
        lakesRun.add(como);

        //It would be incredibly elegant (in my opinion) if I hadn't had to hard code all the bunch of lines
        //before the loop
        for (LakeTimes fastest : lakesRun){
            System.out.println("The fastest lap for lake " + fastest.getName() + " is " + fastest.getFastestLap());
        }

    }
}

