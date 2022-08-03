package day3;
public class OverloadingDemo {
    void A(){System.out.println("void A()");}
    void A(int args1){System.out.println("void a(String args1)");}
    void A(String args1){System.out.println("void a(String args1)");}
    //int A(){System.out.println("void A()");}

    public static void main(String[] args){
        OverloadingDemo od=new OverloadingDemo();
        od.A(); //인자 없는 거 호출 
        od.A(1);
        od.A("soo jin");
    }

}
