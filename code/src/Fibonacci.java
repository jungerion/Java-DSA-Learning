public class Fibonacci {

    public static int Fibo( int n){
//        c=a+b;
//        a=b; b=c;
//        return c+Fibo(0,1,c,n);
        if(n==0) return 0;
        if(n==1) return 1;

        return Fibo(n-1)+Fibo(n-2);
    }

    static void main(String[] args) {
        System.out.println(Fibo(5));
    }
//        if(n==0) return;

//        int c=a+b;
//        System.out.print(c);
//        Fibo(b,c,n-1);
////        c=a+b;
////        return n+Fibo(0,1,n);
//
//    }
//
//
//    void main(String[] args) {
//         int a=0; int b=1;
//        System.out.print(a);
//        System.out.print(b);
//        int n=7;
//        Fibo(a,b,n-2);
////        System.out.println(Fibo());
//    }


}