package jungsuk.chapter7;

class myparent{
    private int prv; //같은 클래스  
            int dft; //같은 패키지  
    protected int prt; //같은 패키지+자손(다른 패키지)
    public int pub; //접근제한 없음

    public void printMem(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }

}

public class myparentTest {
    public static void main(String[] args){
        myparent p=new myparent();
        //System.out.println(p.prv);
        //에러: 접근 범위 안 맞음
         
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
