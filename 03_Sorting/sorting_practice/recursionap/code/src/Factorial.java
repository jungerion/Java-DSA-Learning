public class Factorial {

    public static int Fact(int n){
        if(n==1||n==0) return 1;

        return n*Fact(n-1);
    }

    static void main(String[] args) {
        System.out.println(Fact(5));
    }

    //     Recursive factorial
//    public static int calcFact(int n) {
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//
//
//        int fact_nm1 = calcFact(n - 1);
//        int fact_n = n * fact_nm1;
//        return fact_n;
//    }
//
//    static void main(String[] args) {
//        int n = 5;
//        int ans = calcFact(n);
//        System.out.println(ans);
//    }
}
//public static int calcFact(int n){
//    if(n==0||n==1){
//        return 1;
//    }
//    return n*calcFact(n-1);
//}
//
//    static void main(String[] args) {
//        System.out.println(calcFact(5));
//    }
//
//}
