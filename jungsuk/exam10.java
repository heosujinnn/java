package jungsuk;
//6-24 주어진 값의 절대값을 반환한다. 


public class exam10 {
    static int abs(int value){
        if (value<0){
            value*=-1;
        }
        return value;
        //삼항연산자로 표현
        //return value<0? -value: value;
    }

public static void main(String[] args){
    int value=5;
    System.out.println(abs(value));
    value=-10;
    System.out.println(abs(value));

}
}
