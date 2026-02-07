import java.util.Arrays;

public class ChangeValue {
   public static void main(String[] args) {
        // Create an array
       int[] arr={1,3,2,45,6};
       change(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void change(int[]  nums){
       // If you make a change to this object via reference variable, same object will be changed
       nums[0]=99;  // Here, we are modifying the object but not actually changing the whole thing

    }
}
