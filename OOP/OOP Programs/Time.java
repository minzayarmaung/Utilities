package OOP_Practise;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Time {
    private int hour=23;
    private int minute=59;
    private int second=59;

    public Time(int hour , int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void setTime(int hour , int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }
    @Override
    public String toString() {
        LocalTime time = LocalTime.of(getHour(),getMinute(),getSecond());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatter);
        
        return formattedTime;
    }
    public Time nextSecond(){
         if(getHour()==23 && getMinute()==59 && getSecond()==59){
           setTime(0, 0, 0);
        }
        else{
            setSecond(getSecond()+1);
        }
        return this;
    }
    public Time previousSecond(){
        if(getHour()==0 && getMinute()==0 && getSecond()==0){
            setTime(23, 59, 59);
        }
        else{
            setSecond(getSecond()-1);
        }
        return this;
    }
    public static void main(String[] args) {
        // Test constructors and toString()
      Time t1 = new Time(1, 2, 3);
      System.out.println(t1);  // toString()

      // Test Setters and Getters
      t1.setHour(4);
      t1.setMinute(5);
      t1.setSecond(6);
      System.out.println(t1);  // toString()
      System.out.println("Hour: " + t1.getHour());
      System.out.println("Minute: " + t1.getMinute());
      System.out.println("Second: " + t1.getSecond());

      // Test setTime()
      t1.setTime(23, 59, 58);
      System.out.println(t1);  // toString()

      // Test nextSecond();
      System.out.println(t1.nextSecond());
      System.out.println(t1.nextSecond().nextSecond());

      // Test previousSecond()
      System.out.println(t1.previousSecond());
      System.out.println(t1.previousSecond().previousSecond());
   }

}
