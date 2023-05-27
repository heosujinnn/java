package Recursion;
// x의 n제곱 
// x의 0제곱 = 1 
// x의 제곱 = x * x (n-1)승  (n>0)
public class power {
    public static double powerTest(double x, int n){
        if(n==0){
            return 1;
        }
        else{
            return x*powerTest(x,n-1);
        }
    }
    public static void main(String[] args) {
        double res=powerTest(5.0 ,3);
        System.out.println(res);
    
    }
    
}
