//public class Main {

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



//    public static void printSum(int i, int n, int sum){
//        if(i==n){
//            sum+=i;
//            System.out.print(sum);
//            return;
//        }
//        sum+=i;
//        printSum(i+1,n,sum);
//
//    }
//    static void main(String[] args) {
//    printSum(1,5,0);
//    }
//
//}

public class Main {
    // Sum of n numbers

//    public static void printSum(int i, int n, int sum){
//        if(i==n){   // Base case
//            sum+=i;
//            System.out.println(sum);  // Here, 15 is printed and returned
//            return;
//        }
//        sum+=i;
//        printSum(i+1,n,sum);
//        System.out.println(i);
//    }
//    static void main(String[] args) {
//    printSum(1,5,0);
//    }

    public static int sum(int n){
        if(n == 1) return 1;   // base case
        return n + sum(n - 1);
    }

    public static void main(String[] args){
        System.out.println(sum(5));   // prints 15
    }


//    public static void printNumb(int n){
//        if(n==6){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n+1);
//    }
//
//    static void main(String[] args) {
//        int n=1;
//        printNumb(n);
//    }



}






























