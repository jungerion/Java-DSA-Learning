import java.util.Arrays;

public class Rough {
public static int[] buildArray(int[] nums){
    int n=nums.length;
    int[] ans=new int[n];
    for (int i = 0; i < n; i++) {
        ans[i]=nums[nums[i]];
    }
    return ans;


}

   public static void main(String[] args) {
int[] nums={0,2,1,3,5,4};
int[] result=buildArray(nums);
       System.out.println(Arrays.toString(result));
    }

public static void printArray(int[] arr) {
    for (int x : arr) {
        System.out.println(x + " ");
    }
    System.out.println();
}
}