package array;

public class min {
    public static void main(String[] args) {
        int arr[]=new int[]{4,6,8,9,9,5};
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];


        }
        System.out.println("smallest element is:"+min);
    }
}
