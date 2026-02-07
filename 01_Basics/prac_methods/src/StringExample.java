//import java.util.Scanner;
//
//public class StringExample {
//    static void main(String[] args) {

import java.util.Scanner;

////       String message= greet();
////        System.out.println(message);
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name=sc.nextLine();
//        String personalised =myGreet(name);
//        System.out.println(personalised);
//
//    }
//
//    private static String myGreet(String name) {
//        String message="Hello "+name;
//        return message;
//    }
//
//    public static String greet(){
//        String greeting="Hy";
//        return greeting;
//    }
//}

public class StringExample {
    static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=in.nextLine();
        String personalised=myGreet(name);
        System.out.println(personalised);
    }
    public static String myGreet(String name){
        String message="Hello "+name;
        return message;


    }
}
