//import java.util.Scanner;
//
//public class Sum {
//    public static void main(String[] args){
////        sum();
////        int ans =sum2();
////        System.out.println(ans);
//        int ans=sum3(20,30);
//        System.out.println(ans);
//    }
//
//// pass the value of numbers when you are calling the method from main()
//
//    static int sum3(int a, int b){
//        int sum =a+b;
//        return sum;
//    }
//    // return the value
//    static int sum2(){
//        Scanner in =new Scanner(System.in);
//
//        int num1,num2,sum;
//
//        System.out.print("Enter number 1: ");
//        num1=in.nextInt();
//        System.out.print("Enter number 2: ");
//        num2=in.nextInt();
//        sum = num1 +num2;
////        System.out.println("Sum is "+sum);
//        return sum;
////        System.out.println("shsh");
//    }
//

import java.util.Scanner;

////    static void sum(){
////        Scanner in =new Scanner(System.in);
////
////        int num1,num2,sum;
////        System.out.print("Enter number 1: ");
////        num1=in.nextInt();
////        System.out.print("Enter number 2: ");
////        num2=in.nextInt();
////        sum = num1 +num2;
////        System.out.println("Sum is "+sum);
////    }
//
//    /*
//    access modifier , return type, name,
//         */
//
//}

public class Sum {
    static void main(String[] args) {
//        sum();
//        int ans=sum2();
//        System.out.println("Sum iss: "+ans);
        int sum=sum3(4,4);
        System.out.println("The sum: "+sum);
    }
    //// pass the value of numbers when you are calling the method from main()

    public static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }


    public static int sum2(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a =in.nextInt();
        System.out.print("Enter number 2: ");
        int b=in.nextInt();

        int sum=a+b;
        return sum;
//        System.out.println(sum);
    }

    public static void sum(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a =in.nextInt();
        System.out.print("Enter number 2: ");
        int b=in.nextInt();

        int sum=a+b;
        System.out.println("Sum is: "+sum);
    }
}
