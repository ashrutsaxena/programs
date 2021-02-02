package BASIC;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int num=sc.nextInt();
        int f=0;
        int l=1;
        System.out.println(f+" "+l);
        int sum=0;
        for(int i=2;i<num-2;i++){
            sum=f+l;
            f=l;
            l=sum;
            System.out.println(" "+sum);
        }
        sc.close();

    }
}
