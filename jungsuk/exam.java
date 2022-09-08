package jungsuk;
//자바의 정석 챕터 육 연습문제
public class exam {
    public static void main(String[]args){
        SutaCard card1=new SutaCard(3,false);
        SutaCard card2=new SutaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }
}
class SutaCard{
    int num;
    boolean isKwang;

    SutaCard(){ //기본생성자
        num=1;
        isKwang=true;
    }
    SutaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }
    String info(){
        String info;
        if(isKwang==true){
            info=num+"K";

        }else{
            info=num+" ";
        }
        return info;
    }
}
