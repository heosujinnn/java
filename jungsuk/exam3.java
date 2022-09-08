package jungsuk;

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name,int ban, int no, int kor,int math,int eng){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.eng=eng;
        this.math=math;
    }
    
    String info(){
        String info="";
        info=name+" "+ban+" "+no+" "+kor+" "+eng+" "+math+" "+getTotal()+" "+getAvg()+" ";
        return info;
    }

    int getTotal(){
        return kor+math+eng;
    }
    float getAvg(){
        return (kor+math+eng)/3;

    }
}

public class exam3 {
    //챕터6-3 연습문제 
    public static void main(String[] args){
        Student s=new Student("길동이",1,1,100,60,76);
        System.out.println(s.info());
        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAvg());

}
}
