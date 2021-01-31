package array;

import java.util.ArrayList;
import java.util.Scanner;

public class left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a =sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter the " + (i+1) +"st snumber");
            arr[i] = sc.nextInt();
        }
        System.out.println("So how much rotation u want?");
        int k = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = k; i <arr.length ; i++) {
            ans.add(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            ans.add(arr[i]);
        }
        System.out.println("So Final Ans is");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
