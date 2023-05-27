package Recursion;
// recursion이 항상 무한 루프에 빠지는 것은 아니다. 
//1~k까지의 합
public class test{
    public static void main(String[] args) {
    int n=func(4);
    System.out.println(n);
    }
    public static int func(int k){
        if(k<=0)
        return 0; 
        else {
            System.out.println("hi");
            return k+func(k-1);          
        }
    }
}
