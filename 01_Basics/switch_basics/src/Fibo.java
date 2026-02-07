import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;

        }
        System.out.println(b);
    }
}

//  0 1 , 1, 0+1=1, 2, 3 ,
// 0,1,