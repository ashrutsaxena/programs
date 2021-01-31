import java.util.Scanner;

public class Fibnocci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int f = 0;
        int l = 1;
        System.out.print(f + " " + l);
        int sum = 0;
        for (int i = 0; i < num - 2; i++) {
            sum = f + l;
            f = l;
            l = sum;
            System.out.print(" " + sum);

        }
        sc.close();
    }
}
