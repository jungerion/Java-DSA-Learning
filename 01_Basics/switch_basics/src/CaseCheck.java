import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
//        String word="Aakrit";

        if(ch>'a'&& ch<='g'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
        System.out.println(ch);
    }
}
