public class Countnums {
   public static void main(String[] args) {
        long n=45536555555555l;
        int count=0;
        while(n>0){
           long rem=n%10;
           if(rem==5){
               count++;
           }
           n=n/10;
        }
       System.out.println(count);
    }
}
