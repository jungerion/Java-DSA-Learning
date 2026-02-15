public class FirstAndLastPosition {

public static int[] searchRange(int[] arr,int target){

    int[] ans={-1,-1};
    ans[0]=search(arr,target,true);
    if(ans[0]!=-1) ans[1]=search(arr,target,false);

    return ans;
}

public static int search(int[] arr, int target,boolean findFirst){
    int start=0;
    int end=arr.length-1;
//    int[] ans={-1,-1};
    int ans=-1;

    while(start<=end){
        int mid = start+(end-start)/2;

        if(target<arr[mid]){end=mid-1;}
        else if (target>arr[mid]){start=mid+1;}
        else ans=mid;
        if(findFirst){end=mid-1;}else{start=mid+1;}
    }
return ans;
}

    static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 9};

        int[] result=searchRange(arr,4);
        System.out.println("First position: "+result[0]);
        System.out.println("First position: "+result[1]);
    }
}
