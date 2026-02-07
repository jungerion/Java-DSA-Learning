//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Input {
//   public static void main(String[] args) {
//
//       // array of primitives
//       Scanner in= new Scanner(System.in);
//        int[] arr= new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[3]=278;
//        arr[4]=455;
//        arr[2]=234;
//
//
//        System.out.println(arr[3]);
//
//        for(int num:arr){
//            System.out.println(num+" ");
//        }
//
//        // input using for loops
//
////       for (int i = 0; i <arr.length ; i++) {
////           arr[i]=in.nextInt();
////       }
////
////       for (int i = 0; i <arr.length ; i++) {
////           arr[i]=in.nextInt();
//////           System.out.print(arr[i]+" ");
////       }
////       for(int num:arr){
////           System.out.print(num+" ");
////       }
//
//
//       // arrray of objects
//

import java.util.Arrays;
import java.util.Scanner;

////       System.out.println(Arrays.toString(arr));  // using this method
//
//       String[] str= new String[4];
//       for (int i = 0; i < str.length; i++) {
//           str[i]=in.next();
//       }
//       System.out.println(Arrays.toString(str));
//
//       // modifying the array,
//       str[1]="Aakrit";
//       System.out.println(Arrays.toString(str));
//
//    }
//}

public class Input {
    static void main() {
        Scanner in= new Scanner(System.in);

        // Here this was array of primitives
        int[] arr= new int[5];
        arr[0]=22;
        arr[1]=24;
        arr[2]=2287;              // This is for the new number of arrays
        arr[3]=244;
        arr[4]=245;
//        System.out.println(arr[3]);

        // But if array is of large numbers,
        // Using for loops

        // This is for the input
//        System.out.print("Enter the numbers: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//
//        }

//        System.out.println(Arrays.toString(arr));   // Print this way too, New way to print array

        // This is for the output
//        System.out.print("Here are the numbers: ");
//        for (int i = 0; i < arr.length; i++) {
////            arr[i]=in.nextInt();
//            System.out.print(arr[i]+" ");   // Print this way too
//        }

//        // This is the same as the above but hte enhanced version of the loop
//        for(int num:arr){
//            System.out.print(num+" ");    // Print this way too
//        }
//
        // NOW we do array of objects

        String str[]=new String[4];
        System.out.print("Enter the strings: ");
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }


        System.out.println("Here are the strings: "+Arrays.toString(str));

        //modify
        str[1]="Jung";
        System.out.println("Here is the modified string: "+Arrays.toString(str));

    }
}
































