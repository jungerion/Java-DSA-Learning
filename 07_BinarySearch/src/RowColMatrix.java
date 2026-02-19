import java.util.Arrays;

public class RowColMatrix {
    // For Binary Search in 2D array.
    public static int[] binarySearch2D(int[][] arr, int target){
        // For binary search, first we get start,

        int r=0;
        int c=arr[r].length-1;

        while(r<arr.length&&c>=0){

            if(arr[r][c]==target) {return new int[]{r,c};}
            if(arr[r][c]<target) r++;
            else c--;
        }
        return new int[]{-1,-1};
    }


        // For LinearSearch,
//    public static int[] linearSearch(int[][] arr, int target){
//        // For Linearsearch
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col]==target){
//                    return new int[]{row,col};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

  public   static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
//        int[] resultLinear=linearSearch(arr,37);
//        System.out.println("The target element is in index :"+Arrays.toString(resultLinear));

            int[] res=binarySearch2D(arr,37);
      System.out.println(Arrays.toString(res));
    }
}
