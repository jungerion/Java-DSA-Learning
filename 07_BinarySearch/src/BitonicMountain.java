public class BitonicMountain {

    
    // Finding the peak Elemant
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
    git add PeakMountainArray.java

    static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int peak= peakIndexInMountainArray(arr);
        System.out.println("Element is: "+peak);
        System.out.println("Index of peak element is: "+arr[peak]);
    }
}
