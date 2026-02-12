import java.util.Arrays;

public class SearchIn2DArray {

    public static int[] search2D(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){return new int[]{row,col};}
            }
        }return null;
    }

    public static Integer search2DElement(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){return arr[row][col];}
            }
        }return null;
    }

    public static Integer search2DMax(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max)
                {
                    max=arr[row][col];
//                    return arr[row][col];
                }
            }
        }return max;
    }


    static void main(String[] args) {
        int[][] arr={

                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println(search2DMax(arr));

        int[] ans=search2D(arr,60);
        System.out.println(Arrays.toString(ans));
        System.out.println(ans==null?"Array not found!":"Array found at: row "+ans[0]+" column "+ans[1]);

        Integer result=search2DElement(arr,600);
        System.out.println(result!=null?"Found the element: "+result:"Element not found!");

    }

}
