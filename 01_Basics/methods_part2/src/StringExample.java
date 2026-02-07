import java.util.Scanner;

public class StringExample {
    public static void main(String[]args){
//        String message=greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name=in.next();
        String personalised=myGreet(name);
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message="Hello "+name;
        return message;
    }




    static String greet(){
        String greeting="Aakrit";

        return greeting;
    }
}


