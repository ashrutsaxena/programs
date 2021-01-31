import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0;
        int sum = 0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

        }
    }
