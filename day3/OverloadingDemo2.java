package day3;
//상속
public class OverloadingDemo2 extends OverloadingDemo{
    void A(String arg1,String arg2){System.out.println("sub class:void");}//메소드 오버로딩

    void A(){System.out.println("sub class:void A()");}//메소드 오버라이딩(부모와 자식의 서명이 같음)

    public static void main(String[] args){
        OverloadingDemo2 c1=new OverloadingDemo2();
        c1.A();
        c1.A(1);
        c1.A("soo");
        c1.A("soo","jin");

    }
    
}
