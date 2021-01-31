package array;

public class max{
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,8,9,78,88};

        int maxi=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > maxi)
                maxi = arr[i];
        }
            System.out.println("largest element in array is:"+maxi);

        }
    }
