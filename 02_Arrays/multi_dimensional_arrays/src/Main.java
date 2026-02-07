//import java.util.Arrays;
//
//public class Main{
//  public static void main(String[] args) {
//
//      // Q: store a rol number
//
//      int a =19;
//
//      // Q: store a person's name
//      String name="Aakrit Jung Shah";
//

import java.util.Arrays;
import java.util.Scanner;

////      // Q: store 5 roll numbers
////      //Array
////      //datatype[] variable_name= new datatype[size];
////      int[] rnos= new int[5];
////      // OR directly
////      int[] rnos2={1,23,45,67,89,99};
//
//      int [] ros; // declaration of array, ros is getting defined in the stack
//
//      ros= new int[5]; // Here the object is created in the heap`
//
//      System.out.println(ros[4]);
//
//      String[] arr= new String[4];
//      System.out.println(arr[1]);
//
//    for(String ele: arr){
//        System.out.println(ele);
//    }
//
//
//    }
//}

public class Main {
    static void main(String[] args) {

        int[] ros={2,3,4,5,6};

        int ros1[]={1,2,03,4};

       int roll[]; roll=new int[4];
//        System.out.println(roll[3]);
//        System.out.println(ros2[1]);
//
//        String[] name= new String[4];
//        for(String str:name){
//            System.out.println(str);
//        }


//        System.out.println(name[2]);
//        System.out.println(name[7]);

//        int[] ary= {4,5,60};
//        System.out.println(ary[2]);

        int [] art= new int[3];
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter inputsss: ");
        for (int i = 0; i < art.length; i++) {
//            System.out.println(i);
            art[i]=sc.nextInt();
        }

        System.out.println("Output is: ");
        for (int i = 0; i < art.length; i++) {
            System.out.print(Arrays.toString(art));
        }

//        for(int out:art){
//            System.out.println(Arrays.toString(out));
//        }



    }
}




































