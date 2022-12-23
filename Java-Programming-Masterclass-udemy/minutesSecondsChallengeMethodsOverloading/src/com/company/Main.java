package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(3945));
        System.out.println(10%(3));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || ((seconds <0) || (seconds >= 60))) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int hours = (int) minutes / 60;
            int totalMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = totalMinutes + "m";
            if (totalMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + " " + minutesString + " " + secondsString;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds <0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutes = (int) seconds / 60 ;
            int remainingSeconds = (int) seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
