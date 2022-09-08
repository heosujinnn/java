package jungsuk;



public class exam4 {
    //chapter6 exercise6-6
    //두 점 사이의 거리 계산하기 
    static double getDistance(int x,int y,int x1,int y1){
        int width=x1-x;
        int height=y1-y;
        double answer=Math.sqrt((Math.pow(width,2)+Math.pow(height,2)));
        return answer; 
    }
    
    public static void main(String[] args){
        
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
