package java2;

import java.text.DecimalFormat;

public class Clock {

    private int secondsAfterMidnight;
    private int hours;
    private int minutes;
    private int seconds;

    //Default constructor
    public Clock()
    {
        this (12, 0, 0);
    }

    //Constructor with parameters, to set the time
    public Clock (int h, int m, int s)
    {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public Clock(int secondsAfterMidnight)
    {
        this.secondsAfterMidnight = secondsAfterMidnight;
        setClock(this.secondsAfterMidnight);
    }

    public void setClock(int secondsAfterMidnight){

        this.hours = this.secondsAfterMidnight / 3600;
        this.minutes = this.secondsAfterMidnight % 3600 / 60;
        this.seconds = this.secondsAfterMidnight % 60;

    }

    public void tick(){

        this.seconds += 1;
        this.minutes+=(int)(this.seconds/60);
        //update seconds
        this.seconds = this.seconds % 60;
        //add overflow to minutes from seconds
        this.hours+=(int)(this.minutes/60);
        //update minutes
        this.minutes= this.minutes% 60;
        this.hours = this.hours%24;
        //System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
    }

    public static Clock addClock(Clock t1, Clock t2) {

        Clock sum = new Clock();
        sum.hours = t1.hours + t2.hours;
        sum.minutes = t1.minutes + t2.minutes;
        sum.seconds = t1.seconds + t2.seconds;

        if (sum.seconds >= 60.0) {
            sum.seconds -= 60.0;
            sum.minutes += 1;
        }
        if (sum.minutes >= 60) {
            sum.minutes -= 60;
            sum.hours += 1;
        }
        return sum;
    }

    public void tickDown(){

        this.seconds -= 1;
        if(this.seconds <0){
            this.seconds+=60;
            this.minutes-=1;
        }
        if(this.minutes<0){
            this.minutes+=60;
            this.hours-=1;
        }
        if(this.hours<0){
            this.hours+=24;
        }
    }


    public static Clock subtractClock(Clock t1, Clock t2) {

        Clock difference = new Clock();
        difference.hours = t1.hours - t2.hours;
        difference.minutes = t1.minutes - t2.minutes;
        difference.seconds = t1.seconds -  t2.seconds;
        return difference;
    }

    public int getHour ()
    {
        return this.hours;
    }
    public int getMinute ()
    {
        return this.minutes;
    }
    public int getSecond ()
    {
        return this.seconds;
    }

    // convert to String in (00:02:34) format
    public String toFormat()
    {
        String str="";
        DecimalFormat f = new DecimalFormat("00");
        str = f.format(getHour ()) + ":" + f.format(getMinute ()) + ":" + f.format(getSecond ());
        System.out.println(str);
        return str;
    }
}
