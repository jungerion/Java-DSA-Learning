public class FindInPeak {
   public static int searchInBitonic(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        // Finding in asc order ,searching in asc
        int asc=orderAgnosticSearch(arr,target,0,peak);
        // If found here do this for first before peak ascending order search
        if(asc!=-1){return asc;}
        // If not found do descending search in peak
        else return orderAgnosticSearch(arr,target,peak+1,arr.length-1);

    }

    public static int orderAgnosticSearch(int[] arr, int target,int start, int end){


        boolean isAsc=arr[start]<arr[end];

        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;

            if(isAsc){
                if(target<arr[mid]){  //
                    end=mid-1;
                }else start=mid+1;
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else start=mid+1;
            }
        }


        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start=0;  int end=arr.length-1;

        while(start<end) {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,3,2,1};
int result=searchInBitonic(arr,3);
        System.out.println((result!=-1)?"Target found at: "+result:"Target not found!");
    }
}
