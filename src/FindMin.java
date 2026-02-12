public class FindMin {
public static int findMin(int[] arr){
    int min=arr[0];
    for (int i = 0; i < arr.length; i++) {

        if(arr[i]<min){
            min=arr[i];
        }

    }return min;
}

public static int findMax(int[] arr){
    int max=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max)
            max=arr[i];
    }return max;
}

    static void main(String[] args) {
        int[] arr = {4, 5, 8, 79, 7, 4, 5, 4, 5, 8, 45, 54, 5};
        System.out.println("Minimum value is: "+findMin(arr));
        System.out.println("Maximum value is: "+findMax(arr));
    }

}
