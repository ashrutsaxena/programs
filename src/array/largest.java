package array;

import java.util.Arrays;

public class largest {
    public static int getlargest(int a[],int total){
        Arrays.sort(a);
        return a[total-1];

    }

    public static void main(String[] args) {
        int a[]=new int[]{4,5,8,9,5};
        System.out.println("largest element in array is:"+getlargest(a,5));
    }
}
