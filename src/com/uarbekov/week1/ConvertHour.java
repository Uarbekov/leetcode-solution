package com.uarbekov.week1;

public class ConvertHour {
    public static void main(String[] args) {
        System.out.println(convertTime("00:00", "23:59"));
    }

    public static int convertTime(String current, String correct) {
        return getTimes(getMinute(correct) - getMinute(current));
    }

    public static int getMinute(String time) {
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }

    public static int getTimes(int time) {
        int count = 0;
        while (time >= 60) {
            time = time - 60;
            count = count + 1;
        }
        while (time >= 15) {
            time = time - 15;
            count = count + 1;
        }
        while (time >= 5) {
            time = time - 5;
            count = count + 1;
        }
        while (time >= 1) {
            time = time - 1;
            count = count + 1;
        }
        return count;
    }


}
