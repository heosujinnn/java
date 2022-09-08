package jungsuk.chapter7;
//캡슐화와 접근제어자 
class Time {
    private int hour; //0-23사이의 값
    private int minute;
    private int second;

    public void setHour(int hour){
        if(isValidHour(hour)) return ;
        this.hour=hour;
    }
    private boolean isValidHour(int hour){
        return hour<0 ||hour>23;

    }
    public int getHour(){
        return hour;
    }
}
public class capTest{
public static void main(String[] args){
    Time t= new Time();
    t.setHour(21); //hour 을 21로 변경
    System.out.println(t.getHour());
    t.setHour(100);
}
}//접근제어자의 범위는 최대한 좁히는 것이 좋음