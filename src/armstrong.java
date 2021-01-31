import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int sum=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int temp=num;
        while(num>0){
            rem=num%10;
            num=num/10;
            sum=sum+(rem*rem*rem);

        }
        if(temp==sum){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number1");
        }
    }
}
