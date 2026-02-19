    public class RBS {
    /*
    The part where duplicate is written is the part to check for the duplicates in array,
    otherwise without it, it works.
     */
    static int findPivotWithDuplicates(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 1. Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

            // 2. Handle duplicates: skip them
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // NOTE: Check if start or end were the pivots before skipping!
                if (arr[start] > arr[start + 1]) return start;
                start++;
                if (arr[end] < arr[end - 1]) return end - 1;
                end--;
            }
            // 3. Left side is sorted, so pivot must be on the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


        static void main(String[] args) {
            int[] arr = {2,2,2,9,2,2,2};
//            int[] arr1 = {4,5,6,7,0,1,2};


            int result=findPivotWithDuplicates(arr,9);
            System.out.println(result);
//            int res=findPivotWithDuplicates(arr);

        }
    }
