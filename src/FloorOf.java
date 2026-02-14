public class FloorOf {

    public static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
if(target<arr[0]) return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else return mid;
        }
return end;
    }

    static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
int result=search(arr,15);
        System.out.println(result!=-1?"Found at index: "+result+" \nThe number is: "+arr[result]:"Not found!");
    }
}
