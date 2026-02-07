import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
//        fun(2,3,5,4,6,8);
//        fun();
        multiple(2,3,"Aakrit","Jung","Shah");
        demo(2,3,4);
        demo("Aakrit","Jung","Shah");
//        demo();
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
