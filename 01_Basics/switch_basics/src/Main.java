import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit=in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Keeps a doctor away");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Winess");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        int day =in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thurday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }

//        switch (day) {
//            case 1:
//
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thurday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//        }
//            switch(day){
//                case 1,2,3,4,5-> System.out.println("Weekday");
//                case 6,7-> System.out.println("Weekend");
//            }
    }}

