//public class StringExample {
//    public static void main(String[] args){
////    String message=greet();
////        System.out.println(message);
//
//    }
//    static String greet(){
//        String greeting="How are you?";
//        return greeting;
//    }
//}


public class StringExample{
    public static void main(String[] args){
        String personalised=myGreet("Aakrit");
        System.out.println(personalised);

    }

    private static String myGreet(String name) {
        String message="Hello hy"+" "+name;
        return message;
    }

//    static String greet(){
//        return "Aakrit";
//       String greeting="Aakrit";
//       return greeting;
//    }
}