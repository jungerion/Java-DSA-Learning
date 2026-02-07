public class Swap {
    static void main(String[] args) {
        int a=10;
        int b=20;
    //Swap numbers
//        int temp=a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println(a+" "+b);

        String name="Aakrit Jung Shah";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name="Veolci";
    }

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
