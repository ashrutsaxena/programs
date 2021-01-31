package array;

public class fr {
    public static void main(String[] args) {
        int arr1[]=new int[]{2,3,4,5,6,7,2,2,23,3,3};
        int a;
        int arr2[]=new int[25];
        for(int i=0;i< arr1.length;i++) {
            a = arr1[i];
            arr2[a]++;
        }
        for (int i = 0; i < arr2.length ; i++) {
            if(arr2[i]>0){
                System.out.println(i+"times repeat"+arr2[i]);
        }
            }
    }}

