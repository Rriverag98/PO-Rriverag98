/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author Rodrigo
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return String.format("%02d", this.hour)+"/"+String.format("%02d", this.minute)+"/"+String.format("%02d",this.second);
    }
    
    public Time nextSecond() {
      ++second;
      if (second == 60) {
         second = 0;
         ++minute;
         if (minute == 60) {
            minute = 0;
            ++hour;
            if (hour == 24) {
               hour = 0;
            }
         }
      }   
      return this;
   }
    
    public Time previousSecond(){
      --second;
      if (second == 60) {
         second = 0;
         --minute;
         if (minute == 60) {
            minute = 0;
            --hour;
            if (hour == 24) {
               hour = 0;
            }
         }
      }
      return this;
   }
    
}
