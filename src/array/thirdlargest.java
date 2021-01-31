package array;

import java.util.Arrays;

public class thirdlargest {
    public static int getThirdLargest(int a[],int total){
        Arrays.sort(a);
        return a[total-3];
    }

    public static void main(String[] args) {
        int a[]=new int[]{4,6,8,9,55,88};
        System.out.println("third largest element in array is:"+getThirdLargest(a,6));
    }
}
