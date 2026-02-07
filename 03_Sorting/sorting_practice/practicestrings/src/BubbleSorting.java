public class BubbleSorting {

//    public static void print(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }

//    public static void print(int[] arr){
//        for(int x:arr){
//            System.out.println(x+" ");
//        }
//    }
//
//    static void main(String[] args) {
//        int[] arr={7,8,3,1,2};

        // Bubble sort

        // For loop

//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                // Now comparing and swapping the elements
//
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//
//        }
//        print(arr);
//}
//static void main(String[] args) {
//    int[] arr={7,8,3,1,2};
//    // Bubble sort
//    // Using loop
//    for (int i = 0; i < arr.length; i++) {
//
//        for (int j = 0; j < arr.length-1-i; j++) {
//            // comparing
//            if(arr[j]>arr[j+1]){
//                int temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//        }
//    }print(arr);
//
//}
//        public static void print(int[] arr) {
//            for (int x : arr) {
//                System.out.print(x + " ");
//            }
//        }

    public static void print(int[] arr){for(int x:arr){
        System.out.print(x+" ");
    }}
    static void main(String[] args) {
        // Bubble sort

        int[] arr={7,8,3,1,2};
        // Loop
        for (int i = 0; i < arr.length; i++) {        // i=0    arr.length= 5
            for (int j = 0; j < arr.length-1-i; j++) {// j=0  arr.length=4
                // Comparing
                                        // Here below, we take 8 and 3, index also accordingly, because first index, 7>8 is false so next round
                if(arr[j]>arr[j+1]){    // arr[0]>arr[0+1]-->So,arr[1]>arr[1+1]--> arr[1]>arr[2]-->8>3
                    int temp=arr[j];    // Here, arr[1] was 8 so now the value is assigned to temp, so arr[1] is emtpy, arr[1]=8-->   temp=8
                    arr[j]=arr[j+1];    // arr[1]=arr[1+1]-->arr[1]=arr[2]-->arr[1] is now 3 and arr[2] is empty,-->   arr[j]=3
                    arr[j+1]=temp;      // Here, arr[j+1] which is arr[1+1]-->arr[2] is temp, that is,-->8, So arr[2]=8, Now, the array is, {7,3,8,1,2}
                }
            }
        }

        print(arr);

    }
}
