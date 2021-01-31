package array;

public class sort {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 8, 2, 9, 1, 2};
        int temp = 0;

        System.out.println("elements of original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }}
            System.out.println("elements of array is:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");


        }

    }}

