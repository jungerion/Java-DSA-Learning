public class searchInRangeIndex {
// This right here is for searching in range for printing index
    public static int search(int[] arr, int target, int start, int end){
       if(start<0||end>=arr.length||start>end){return -1;}
        for (int i = start; i < end; i++) {
            if(arr[i]==target){return i;}
        }return -1;
    }



    static void main(String[] args) {
        int[] arr={1,2,4,8,8,7,45,9,7,454};
        int target=45;
        int start=4; int end=8;
        int res=search(arr,target,start,end);
        System.out.println(res!=-1?"Element found at the index: "+res:"Element not found");
    }
}
