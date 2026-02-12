public class Main {
    // Linear search for fining the element itself
    public static int search(int[] arr, int target){
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==target) return i;
//        }
//        return -1;

        for(int x:arr){if(x==target)return x;
        }return -1;
    }

    static void main(String[] args) {
        int[] arr={2,1,4,5,7,8,9,5,8,4,50,20,70,8952,8,56,5,56,5,65,1,5,1,8,1,8};
        int target=8952;
        System.out.println(search(arr,target));
    }


    // Linear search for finding index of element
//public static int search(int[] arr, int target) {
//    for (int i = 0; i < arr.length; i++)
//        if (arr[i] == target) {
//            return i;
//        }
//    return -1;
//}
//    static void main(String[] args) {
//int [] arr= {20,10,30,40,50,60};
//int target=30;
//int result=search(arr,target);
////
//        System.out.println(result==-1?"Element not found":"Element fount at index: "+result);
//
////        System.out.println(result == -1 ? "Element not found" : "Element found at index: " + result);
//
//    }
}