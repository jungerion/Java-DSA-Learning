public class Scope {
   public static void main(String[] args) {
        int a =10;
        int b=20;
        String name="Aakrit";
//       System.out.println(marks);
       {
           a=78; // We can actually modify it, change it, whatever
//           System.out.println(a);
           //           int a=78;  // But we cannot use a again, because already initialized outside the block so cannot initializa again but can modify it
           int c=90;
           name="Jung";
           System.out.println(name);

       }
//       int c=55;
//       System.out.println(c); // Cannot use outside the block
       System.out.println(a);
       System.out.println(name);


       // Scoping in for loop

       for(int i=0;i<4;i++){
           int num=90;
//           int a=10;
           a=111;
//           int c=77;
           System.out.println(a);
       }
//       System.out.println(i);

    }
    static void random(int marks){
        int num=67;
//        int a=78;
        System.out.println(num);
        System.out.println(marks);
   }
}
