package MATRIX;

import java.util.Scanner;

public class subtract_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows for matrix 1");
        int row=sc.nextInt();
        System.out.println("enter columns for matrix 2");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("enter elements of matrix");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter rows for matrix 1");
        int row2=sc.nextInt();
        System.out.println("enter columns for matrix 2");
        int column2=sc.nextInt();
        int arr2[][]=new int[row2][column2];
        System.out.println("enter elements of matrix");
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix a----->");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix b--->");
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        if((row==row2)||(column==column2)){
            System.out.println("matrix a - matrix b -----matrix c");
            int arr3[][]=new int[arr.length][arr2.length];
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3.length; j++) {
                    arr3[i][j]=arr[i][j]-arr2[i][j];
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
