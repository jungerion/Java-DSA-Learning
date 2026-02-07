import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {

//        Scanner in = new Scanner(System.in);//Syntax
//        ArrayList<Integer> list= new ArrayList<>(10);

//        list.add(67);
//        list.add(123);
//        list.add(234);
//        list.add(5684);
//        list.add(798);
//        list.add(654);
//        list.add(21);

//        System.out.println(list);
//
//
//        System.out.println(list.contains(654));
//        list.set(0,999);
//        list.remove(2);
//        System.out.println(list);

        // input
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//
//        //get item at any index
//        for (int i = 0; i < 5; i++) {
////            list.add(in.nextInt());
//            System.out.println(list.get(i));
//            }
//
//        System.out.println(list);

        // Syntax

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list= new ArrayList<>(10);
//        list.add(123);
//        list.add(234);
//        list.add(5684);
//        list.add(798);
//        list.add(654);
//        list.add(21);

//        System.out.println(list.contains(234));
//        System.out.println(list);
//        list.set(0,321);
//        list.remove(2);
//        System.out.println(list);

        //input
        System.out.print("Enter the inputs: ");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here
        }

        System.out.println(list);
        System.out.println(list.get(2));
    }
}
