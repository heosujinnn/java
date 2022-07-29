package day1;
//버블 정렬 알고리즘 
//버블정렬은 연못바닥에서 수면으로 거품이 올라오듯 정렬함. 
public class bubbleSort {
    public static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.printf("["+a[i]+"]");
        }
    }   
    public static void main(String[] args){
        int[]a={90,34,78,12,44};
        int ins,cmp,temp;
        System.out.printf("정렬 전:");
        printArray(a);

        //버블 정렬로 오름차순 정렬 
        for(ins=0; ins<a.length-1;ins++){
            for(cmp=0; cmp<a.length-ins-1; cmp++){
                if(a[cmp]>a[cmp+1]){
                temp=a[cmp];
                a[cmp]=a[cmp+1];
                a[cmp+1]=temp;

            }
        }
    } 
    //정렬 후
    System.out.printf("\n정렬 후:");
    printArray(a);
}
}
