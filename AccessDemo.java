//접근제어자 
//외부로부터 데이터를 보호하기 위해서 
class A{
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class AccessDemo {
    public static void main(String[] args){
        A a=new A();
        
        System.out.println(a.y());
        //System.out.println(a.z());
        //오류? 프라이빗이니까 

        System.out.println(a.x());
        //하지만 x->z로 가는 것은 가능함
    }
    
}
