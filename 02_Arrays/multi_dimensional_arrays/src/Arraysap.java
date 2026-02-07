import java.util.Scanner;

public class Arraysap {
    static void main(String[] args) {
//        int[] marks= new int[3];
//        int marks[]=new int[3]; // We can also use the [] after as well
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size: ");
        int size=sc.nextInt();
        int numbers[] = new int[size];
//        marks[0]=97;
//        marks[1]=98;
//        marks[2]=95;
        System.out.println("Enter the numbers: ");

        for (int i = 0; i <size ; i++) {
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be found: ");
        int x=sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==x){
                System.out.println("x found at index: "+i);
            }
        }

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for (int i = 0; i < size; i++) {
//            System.out.print(numbers[i]+" ");
//        }


    }
}
