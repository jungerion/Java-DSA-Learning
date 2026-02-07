public class Main {

    // This for printing 5 to 1
//    public static void printNum(int n){
//        if(n==0){return;}
//        System.out.print(n+" ");
//        printNum(n-1);
//    }
//    static void main(String[] args) {
//        int n=5;
//        printNum(n);
//
//    }

    // This for 1 to 5
//    public static void printNum(int n){
//        if(n==6){return;}
//        System.out.print(n+" ");
//        printNum(n+1);
//    }
//    static void main(String[] args) {
//        int n=1;
//        printNum(n);
//
//    }

    // For printing sum of first n natural numbers

    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);

    }
    static void main(String[] args) {
    printSum(1,5,0);
    }

}