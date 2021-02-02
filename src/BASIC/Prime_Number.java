package BASIC;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for(int i=2;i<num;i++){
            if(num==2){
                System.out.println("Prime");
                break;
            }else if(num%i==0){
                System.out.println("Not Prime");
                break;
            }else{
                System.out.println("Prime");
                break;
            }
        }
        sc.close();
    }
}
