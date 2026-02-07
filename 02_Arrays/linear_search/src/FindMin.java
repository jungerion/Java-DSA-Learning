public class FindMin {
    static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};

        System.out.println(min(arr));
    }
    //assume arr.lenght!=0
    //return the minimum value in the array
    public static int min(int[] arr){
        int ans=arr[0];
        System.out.println(ans);

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
