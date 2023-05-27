package Recursion;
//피보나치 예제 
// fn=f(n-1)+f(n-2)
public class fibonacci {
    public static int fibo(int n){
        if(n<2){
            return n; 
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int res=fibo(10);
        System.out.println(res);
    }
}
