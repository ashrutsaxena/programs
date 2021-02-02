package BASIC;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();

//        for(int i=2;i<num;i++){
//            if(i==2){
//                System.out.println("not BASIC.prime");
//                break;
//
//            }
//            else if(i%2==0){
//                System.out.println("not BASIC.prime");
//                break;
//                            }
//
//            else{
//                System.out.println("BASIC.prime");
//                break;
//
//            }
//
//        }
        for (int i = 2; i < num; i++) {
            int count = 0;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
}
