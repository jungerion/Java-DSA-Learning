public class InfiniteArray {
    public static int search(int[] arr, int target, int start, int end){
    /*
    Here's the catch, for the Binary search,
    1. First get the mid
    2. Then after check for the lower than mid or higher than the mid,
    3. Then do the thang
     */
//        int start =0; // Prolly because array index starts at 0.
//        int end=arr.length-1; // Prolly because we have to get to the last index of array, it is the total length minus 1.

        while(start<=end){

            int mid=start+(end-start)/2; // Why we did this extra operation?
            // We did this operation to prevent the overflow, and Java index is in int[] and it should not exceed to overflow.

            if(target<arr[mid]){  // The mid acts as index that we get from calculation
                end=mid-1;
            } else if(target>arr[mid]){
                start=mid+1;
            }else return mid;

        }

        return  -1;
    }

    static int findingRande(int[] arr, int target){
        // First we find the range, first start with a box of size 2 to actually begin with
        // Here, for the array, start is arr[0[ and end is arr[1]
        /*
        So, here's the catch if we know that the target is less than end then we do not need to
        expand the box , AND AND we keep expanding/doubling the box, the end to seek the element.
         */

        int start=0;  int end=1;
    }

    static void main(String[] args) {

    }
}
