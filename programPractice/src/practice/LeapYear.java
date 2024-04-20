package practice;


import java.awt.desktop.SystemSleepEvent;

//Leap Year
public class LeapYear {
    public static boolean isLeap(int y) {
        if (y % 4 == 0 && y % 100 != 0 || (y % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int year = 2024;
        boolean res = isLeap(year);
        if (res) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
