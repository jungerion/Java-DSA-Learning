public class StringBuilders {
    static void main(String[] args) {
        // Strings in Java are immutable

        StringBuilder sb= new StringBuilder("Aakrit");
        System.out.println(sb);
//
//        // print char at index 0
//
//        System.out.println(sb.charAt(0));
//
//        //set char at index, or replace
////        System.out.println(sb.setCharAt(0,'T'));  // This won't work because buiilders do
//        // modification in the same object
//
//        sb.setCharAt(0,'T');
//        System.out.println(sb);

        // Insert function

        sb.insert(0,'Z');
        System.out.println(sb);

        // Delete using .delete

        sb.delete(0,1);
        System.out.println(sb);

        //append

        StringBuilder str= new StringBuilder("h");
        str.append('e');str.append('l');str.append('l');str.append('o');
        System.out.println(str);
        // Here using the append the operation time is reduced because it is modifiying the same string object without ouccpying the extra space
        // Unlike the + + operator
        System.out.println(str.length());





    }
}
