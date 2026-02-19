public class RotationCount {
    public static int findPivot(int[] arr){
        int start=0; int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            // For checking if the mid is pivot or not
            if(mid<end&&arr[mid]>arr[mid+1]) return mid;
            if(mid>start&&arr[mid]<arr[mid-1]) return mid-1;

            // Now we gotta check for the duplicates in the array
//            if(arr[mid]==arr[start]&&arr[mid]==arr[end]) {
//                // Here checking if the start and end is the pivot while skipping
//                if(arr[start]>arr[start+1]) return start; start++;
//                if(arr[end]<arr[end-1]) return end-1; end--;
//            }
            // Here is the updated for checking if the start is not end and viceversa
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Add a check to ensure start is not the last element
                if(start < end && arr[start] > arr[start + 1]) return start;
                start++;

                // Add a check to ensure end is not the first element
                if(end > start && arr[end] < arr[end - 1]) return end - 1;
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
    static int countRotation(int[] arr){
        int pivot=findPivot(arr);
        // Here, we can hide this line because we know that -1+1=0, so just return pivot+1;
//        if(pivot==-1) return 0;
//        else return pivot+1;
        return pivot+1;
    }

    static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr1 = {2,2,2,9,2,2,2};
        int [] arr2={1,2,3,4,6,7,78};
        int result=countRotation(arr);
        System.out.println("Number of times rotated is :"+result);
        int res=countRotation(arr2);
        System.out.println("Number of times rotated is :"+res);


    }
}
