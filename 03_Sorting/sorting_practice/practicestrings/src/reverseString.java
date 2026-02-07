public class reverseString {
    static void main(String[] args) {

        StringBuilder str= new StringBuilder("hello");
        System.out.println(str);
        for (int i = 0; i < str.length()/2; i++) {
            int front=i;
            int back=str.length()-1-i; // 5-1-0, this logic is to for replacing the elements in the last index from front

            char frontChar=str.charAt(i);
            char backChar=str.charAt(back);

            str.setCharAt(front,backChar);
            str.setCharAt(back,frontChar);

        }
        System.out.println(str);

        int a =10;
        int b=0;
//        b=a++;
        b=++a;
        System.out.println(a);
        System.out.println(b);


    }
}
