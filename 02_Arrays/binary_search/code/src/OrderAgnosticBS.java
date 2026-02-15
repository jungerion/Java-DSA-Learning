public class OrderAgnosticBS {
    public static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

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

    static void main(String[] args) {
        int[] ascArr = {1, 3, 5, 7, 9};
        int[] descArr = {9, 7, 5, 3, 1};

        int ascsort=search(ascArr,7);
        int dscsort=search(descArr,7);
        System.out.println("Here's the index of ascending sorted array :"+ascsort);
        System.out.println("Here's the index of descending sorted array :"+dscsort);
    }
}
