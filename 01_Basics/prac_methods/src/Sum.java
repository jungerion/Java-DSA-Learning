import java.util.Scanner;

public class Sum {

    static void main(String[] args) {
//        sum();
//            int ans= sum2();
//        System.out.println(ans);
        int ans=sum3(20,50);
        System.out.println(ans);
    }

    // pass the value of members while calling the method in main()

    public static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }


    //return the value

    public static int sum2(){
        Scanner in=new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2=in.nextInt();

        sum = num1+num2;
        return sum;
//        System.out.println("Sum is: "+sum);
    }


    public static void sum()

    {
        Scanner in=new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2=in.nextInt();

        sum = num1+num2;
        System.out.println("Sum is: "+sum);
    }
}
