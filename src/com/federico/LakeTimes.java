package com.federico;
import java.util.ArrayList;
import java.util.Collections;




public class LakeTimes  {
    String lakeName;
    ArrayList<String> times;

    public LakeTimes(String name, ArrayList<String> circuitTimes) { //class constructor
        this.lakeName = name;
        this.times = circuitTimes;

    }

    public String getName() { //get method for the name

        return this.lakeName;
    }

    public String setName(String lake){ //set method to input the name

        this.lakeName = lake;
        return lake;
    }

    public ArrayList<String> getTimes() { //get method to retrieve the times

        return this.times;
    }

    public void addTime(String circuitTimes) {//method to add a time to the list of times

        times.add(circuitTimes);
    }

    public String getFastestLap() {//method to return the fastest time for the object
        Collections.sort(times);
        return (times.get(0));
    }
}
