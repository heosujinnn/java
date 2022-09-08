package jungsuk;
import java.util.Arrays;
//6-23 
public class exam9 {
    static int max(int arr[]){
        if(arr.length==0||arr==null){
            return -99999;
        }
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

public static void main(String[] args){
    int[] arr=new int[10];
    for(int i=0; i<arr.length; i++){
        arr[i]=(int)(Math.random()*arr.length);
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(max(arr));
}
}
