import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        int empID = in.nextInt();
        String department= in.next();

        switch (empID) {
            case 1 -> System.out.println("Aakrit Jung Shah");
            case 2 -> System.out.println("Rijman");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                        case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No deparment entered");
                }
            }
            default -> System.out.println("Enter correct department");
        }
    }
}
