package day2;

//StationList 클래스 정의
class StationList{
    public String name; //역 이름
    public int next; //연결 정보
}
//연결 리스트를 다루는 클래스 정의
public class insertLinkedList {
    //연결 리스트의 실체가 되는 배열(요소 수:10)
    public static StationList[] list = new StationList[10];
    //head 선언
    public static int head ;
    //연결 리스트의 초기 상태를 만드는 함수 
    public static void initStationList(){
        for (int i=0; i<list.length; i++){
            list[i]=new StationList();
        }
    
    //역 이름과 연결 정보를 설정 
    list[0].name="부산";
    list[0].next=-1;
    list[1].name="대전";
    list[1].next=3;
    list[2].name="서울";
    list[2].next=4;
    list[3].name="동대구";
    list[3].next=0;
    list[4].name="천안아산";
    list[4].next=1;
    
    head=2 ;
}

public static void printStationList(){
    //연결리스트의 요소를 표시하는 메소드
    int idx=head;
    while(idx!=-1){
        System.out.printf("["+list[idx].name+"]->");
        idx=list[idx].next;
    }
    System.out.printf("\n");
}
public static void insertStationList(int insIdx,String insName, int prevIdx){
    list[insIdx].name=insName;
    list[insIdx].next=list[prevIdx].next;
    list[prevIdx].next=insIdx;
}


public static void main(String[] args){
    initStationList();
    printStationList();
    
    insertStationList(5,"광명",2);
    printStationList();
}
}


