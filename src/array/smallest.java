package array;

import java.util.Arrays;

public class smallest {
    public static int getsecondsmallest(int a[],int small){
        Arrays.sort(a);
        return a[1];
    }

    public static void main(String[] args) {
        int a[]=new int[]{4,5,6,8,5,4};
        System.out.println("second smallest element in array is:"+getsecondsmallest(a,6));
    }
}
