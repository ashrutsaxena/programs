package MATRIX;

public class subtract {
    public static void main(String[] args) {
        int arr[][]={{4,5,6},{5,6,8},{4,8,9}};
        int arr1[][]={{5,6,8},{6,35,2},{5,6,6}};

        int c[][]=new int[3][3];

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                c[i][j]=arr[i][j]-arr1[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();

        }
    }
}
