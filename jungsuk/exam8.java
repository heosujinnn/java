package jungsuk;
//숫자인지 아닌지 판별하는 프로그램 


public class exam8 {
    static boolean isNumber(String str){
        boolean isNumber=true;
        for(int i=0; i<str.length(); i++){
            if(!(str.charAt(i)>='0'&&str.charAt(i)<='9')){
                isNumber=false;
            }
        }
        return isNumber;
    }

    public static void main(String[] args){
        String str="123";
        System.out.println(str+" "+isNumber(str));

        String str2="1234o";
        System.out.println(str+" "+isNumber(str2));

    }
}
