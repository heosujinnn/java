package jungsuk; //티비 채널 문제6-21

class myTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MaxVol=100;
    final int MinVol=0;
    final int MaxChan=100;
    final int MinChan=0;

    void turnOnOff(){
        if(isPowerOn==true){
            isPowerOn=false;
        }
        else{
            isPowerOn=true;
        }
        
    }
    void volumeUp(){
        if(volume<MaxVol){
            volume+=1;
        
        }
    }
    void volumeDown(){
        if(volume>MinVol){
            volume-=1;
        }
    }
    void channelUp(){
        channel+=1;
        if(channel==MaxChan){
            channel=MinChan;
        }
    }
    void channelDown(){
        channel-=1;
        if(channel==MinChan){
            channel=MaxChan;
        }
    }

}

public class exam7 {
    public static void main(String[] args){
        myTv t=new myTv();
        t.channel=100;
        t.volume=0;
        System.out.println("ch:"+t.channel+" vol:"+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println(t.channel+" "+t.volume);
        
        t.volume=100;
        t.channelUp();
        t.volumeUp();
        System.out.println(t.channel+" "+t.volume);
    }
    
    
    
}
