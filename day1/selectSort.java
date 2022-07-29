package day1;
//선택정렬알고리즘
public class selectSort {
    public static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.printf("["+a[i]+"]");
        }

    }
    public static void main(String[] args){
        int[] a={99,35,67,24,1,56};
        int ins,cmp,min,temp;
        printArray(a); //정렬 전
        System.out.printf("\n");
        
        for(ins=0; ins<a.length-1; ins++){
            min=ins;
            for(cmp=ins+1; cmp<a.length; cmp++){
                if(a[cmp]<a[ins]){
                    min=cmp;
                    temp=a[ins];
                    a[ins]=a[min];
                    a[min]=temp;
                }

            }
        }
        printArray(a); //정렬 후
    }
    
}
