package com.bootcoding.java;
/* Question :Write a method that takes an integer minutes and converts it to seconds.
*  */
public class MinuteToSecond {
    public static int MinToSec(int n ){
        return n*60;
    }

    public static void main(String[] args) {
        int minutes=10;
        int seconds = MinToSec(minutes);
        System.out.println(minutes+ "minutes are" + seconds+"Seconds");

    }
}
