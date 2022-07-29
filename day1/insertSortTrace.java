package day1;
//삽입 정렬 알고리즘 
public class insertSortTrace {
    public static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.printf("["+a[i]+"]");
        }    
    }
    public static void main(String[] args){
        int[] a={90,34,55,12,57,7,24};
        int ins,cmp,temp; 

        System.out.printf("정렬 전:");
        printArray(a); //배열 각각 출력해주는 코드 
        System.out.printf("\n");

        //삽입정렬로 오름차순 정렬 
        for(ins=1; ins<a.length; ins++){ //ins초기값을 1로 지정해줌 
            temp=a[ins];
            for(cmp=ins-1; cmp>=0; cmp--){ //cmp초기값은 ins-1을 대입 
                if(a[cmp]>temp){
                    a[cmp+1]=a[cmp];
                }else{
                    break;

                }
            }a[cmp+1]=temp; 
        }
    System.out.printf("정렬 후:");
    printArray(a);
    }
}