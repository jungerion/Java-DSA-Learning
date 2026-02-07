//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MultiDimension {
//    static void main(String[] args) {
//
//
//Scanner in = new Scanner(System.in);
//
////        int[][] arr= new int[3][];
////        int[][] arr2D={
////                {1,2,3},
////                {4,5,6},
////                {7,8,9,4,5,4,5}
////        };
////        System.out.println(Arrays.toString(arr2D[1]));
//    int[][] arr=new int[3][3];
//        System.out.println(arr.length);
//
//// Input
//        for (int row = 0; row < arr.length; row++) {
////            arr[i]=in.nextInt();
//            // for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col]= in.nextInt();
//            }
//        }
//
//        // Output
//
////        for (int row = 0; row < arr.length; row++) {
//////            arr[i]=in.nextInt();
////            // for each column in every row
////            for (int col = 0; col < arr[row].length; col++) {
//////                arr[row][col]= in.nextInt();
////                System.out.print(arr[row][col]+" ");
////            }
////            System.out.println();
////
////        }
//

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

////        for (int row = 0; row < arr.length; row++) {
//////            arr[i]=in.nextInt();
////            System.out.println(Arrays.toString(arr[row]));
////
////        }
//
//        for(int[] a: arr){
//            System.out.println(Arrays.toString(a)   );
//        }
//
//
//    }
//}

    public class MultiDimension {
    static void main(String[] args) {

        Scanner in=new Scanner(System.in);

          /*
        1 2 3
        4 5 6
        7 8 9
         */



//        int [][] arr=new int[3][];

//        int[][]arr={
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        int arr[][]=new int[3][3];
        System.out.println(arr.length);

        //input
        System.out.println("Enter arrays: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        // Output
        System.out.println("The arrays are: ");
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
////                arr[row][col]=in.nextInt();
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        Another way to print output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//            }
//            System.out.println()

        // Enhanced for loop

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }



//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }


    }
}





//        int[][] arr= new int[3][]; // this way also works

//        int[][] arr={   // Or this way too, the hard wayyyy
//            {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(arr[2][0]);   --> gives  7
//        System.out.println(Arrays.toString(arr[1]));  ---> gives [4,5,6]

        // OR

        /*
        1 2 3
        4 5
        6 7 8 9
         */
//        Scanner in= new Scanner(System.in);
//        int arr[][]=new int[3][];
//
//        int[][] arr2D={
//                {1,2,3},     // 0th index
//                {4,5},       // 1st index
//                {6,7,8,9}    // 2nd index  ---> arr2D[2]={6,7,8,9}
//        };
//
//        System.out.println(Arrays.toString(arr2D[2]));
//        System.out.println(arr2D[2][2]);
//
//        // input
//
//        for (int i = 0; i < arr2D.length; i++) {
////            arr2D[i]=in.nextInt();
//            for (int col = 0; col < arr[i].length; col++) {
//
//            }
//        }








































