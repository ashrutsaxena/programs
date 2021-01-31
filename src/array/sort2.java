package array;

public class sort2 {
    public static void main(String[] args) {
        int arr[]=new int[]{4,5,8,92,55,66};
        int temp=0;

        System.out.println("elements of original array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("elements after sorting is:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
