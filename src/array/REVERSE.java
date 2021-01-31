package array;

public class REVERSE {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("your original array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println("array in reverse order is:");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]+" ");

        }
    }
}
