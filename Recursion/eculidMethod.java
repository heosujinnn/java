package Recursion;

import java.util.Scanner;

// 최대 공약수 (m>=n)
// 두 수 m,n이 m이 n의 배수라면 gcd(m,n)=n이다.
// 그렇지 않으면 gcd(m,n)=gcd(n, m%n) 이다. 
public class eculidMethod {
    public static int gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
    //2번째 단순한 방법 
    public static int gcd2(int p, int q){
        if(q==0) return p; 
        else return gcd2(q,p%q);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int res = gcd(m, n);
        System.out.println(res);

        System.out.print("정수입력2: ");
        int p=scanner.nextInt();
        int q=scanner.nextInt();
        scanner.close();
        int res2=gcd2(p,q);
        System.out.println(res2);
    }

}
