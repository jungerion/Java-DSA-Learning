public class searchInRangeElement {

public static Integer search(int[] arr, int target, int start, int end){
    if(start<0||end>=arr.length||start>end){return null;}
    for (int i = start; i <=end; i++) {
        if(arr[i]==target){return arr[i];}
    }
    return null;
}
    static void main(String[] args) {
        int[] arr={4,5,8,79,7,4,5,4,5,8,1,45,1,54,5};
        int target=7;
        int start=2;
        int end=8;
        Integer res=search(arr,target,start,end);
        System.out.println(res!=null?"Element found is: "+res:"Element not found!");
    }
}
