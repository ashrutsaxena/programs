
package array;

import java.util.Scanner;

public class leftrotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the element for array :");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of element you want to shift: ");
        int shift = sc.nextInt();

        if (shift >= 0) {
            System.out.print("Array before " + shift + " left shift -->");

            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }

            int temp = 0;
            for (int i = shift; i > 0; i--) {
                temp = arr[0];
                for (int j = 0; j < arr.length-1 ; j++) {
                    arr[j] = arr[j + 1];
                }

                arr[arr.length - 1] = temp;
            }
            System.out.println();

            System.out.print("Array after " + shift + " left shift -->");

            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Sorry! please use positive integer only.(0-9)");
        }

        sc.close();

    }

}