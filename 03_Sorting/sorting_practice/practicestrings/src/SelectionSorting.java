public class SelectionSorting {
//    public static void print(int[] arr){
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//    }
//
//    static void main(String[] args) {
//        int[] arr={7,8,3,1,2};
//
//        // Selection sort
//
//        for (int i = 0; i < arr.length-1; i++) {
//            int smallest=i;
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[smallest]>arr[j]){
//                    smallest=j;
//                }
//            }
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//        }
//        print(arr);
//
//    }
//    public static void print(int[] arr){for(int x:arr){
//        System.out.print(x+" ");
//    }}
//
//static void main(String[] args) {
//    int[] arr={7,8,3,1,2};
//    // Selection sort
//    for (int i = 0; i < arr.length-1; i++) {     //i=0           arr.length=4
//        int change=i;                       // change=i=0
//        for (int j = i+1; j < arr.length; j++) {   // j=i+1=0+1=1, so j=1
//            if(arr[change]>arr[j]){              //  arr[0]=7, arr[1]=8,
//                change=j;                        //
//            }
//        }
//        int temp=arr[change];
//        arr[change]=arr[i];
//        arr[i]=temp;
//    }
//
//
//    print(arr);
//
//}

    // Selection Sorting
//public static void print(int[] arr){for(int x:arr){System.out.print(x+" ");}}
public static void print(int[] arr){for(int x:arr){
    System.out.print(x+" ");
}}
    static void main(String[] args) {
    int[] arr={7,8,3,1,2};
    // For loop
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
            int change=i;
                if(arr[change]>arr[j]){
                    change=j;
                }
                int temp=arr[change];
                arr[change]=arr[i];
                arr[i]=temp;
            }
        }
    print(arr);
    }

}
