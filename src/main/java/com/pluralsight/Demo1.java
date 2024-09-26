package com.pluralsight;

public class Demo1 {

    public static void main(String[] args){
        System.out.println("Hello World!");

        char status = 'm';
        int identifier = 1;
        String name = "Matt";


        String greeting = "Hello " + name;
       // String greeting = "Hello " + "Matt";
        //String greeting = "Hello Matt";

        int numberOfDaysPerWeekWatchesTV = 5;
        int minutesPerDayOnDayWatchedOnAverage = 70;

        int minutesPerWeek = numberOfDaysPerWeekWatchesTV * minutesPerDayOnDayWatchedOnAverage;
        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        int hoursInWorkWeek = 35;

        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        int workWeeksPerYearWatchingTV2 = (5 * 70 * 52 / 60) / 35;


        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV + " week vacation every year");
        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV2 + " week vacation every year");
        

        System.out.println(greeting);

    }
}
