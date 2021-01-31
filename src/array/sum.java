package array;

public class sum {
    public static void main(String[] args) {
        int arr[]=new int[]{4,5,8,9,88,99};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];

        }
        System.out.println("sum of array is"+sum);
    }
}
