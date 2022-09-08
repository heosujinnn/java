package jungsuk;
//exam4: chapter 6-6에서 this 이용한 것 
class myPoint{
    int x;
    int y;


    myPoint(int x,int y){
        this.x=x;
        this.y=y;

    }
    double getDistance(int x, int y){
        int width=this.x-x;
        int height=this.y-y; 
        return Math.sqrt(width*width+height*height);
    }
    
}
public class exam5{


    public static void main(String[] args){
        myPoint p=new myPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }
}
    
