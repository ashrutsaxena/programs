package array;

import java.util.Arrays;

public class secondlargest {
    public static int getsecondlargest(int a[],int total){
        Arrays.sort(a);
        return a[total-2];
    }

    public static void main(String[] args) {
        int a[]=new int[]{4,2,6,8,9};
        System.out.println("second largest element is:"+getsecondlargest(a,5));
    }
}
