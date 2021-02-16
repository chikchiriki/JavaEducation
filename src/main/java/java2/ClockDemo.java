package java2;

import java.util.Scanner;

public class ClockDemo {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seconds: ");
        int secondsAfterMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsAfterMidnight);
        firstClock.toFormat();
        int i =0;
        while (i <10){
            firstClock.tick();
            firstClock.toFormat();
            i++;
        }

        System.out.print("Enter the hours: ");
        int h = scanner.nextInt();
        System.out.print("Enter the minutes: ");
        int m = scanner.nextInt();
        System.out.print("Enter the seconds: ");
        int s = scanner.nextInt();
        Clock secondClock = new Clock(h,m,s);
        int count =0;
        while (count <10){
            secondClock.tick();
            secondClock.toFormat();
            count++;
        }
        Clock.addClock(firstClock, secondClock).toFormat();
        Clock.subtractClock(firstClock, secondClock).toFormat();

    }
}
