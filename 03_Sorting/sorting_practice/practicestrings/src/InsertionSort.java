public class InsertionSort {

//    public static void print(int[] arr){
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//    }
//    static void main(String[] args) {
//        int[] arr={7,8,3,1,2};
//
//        // Insertion sort
//        for (int i = 0; i < arr.length; i++) {
//            int current=arr[i];
//            int j=i-1;
//            while(j>=0&& current <arr[j]){
//                arr[j+1]=arr[j];
//                j--;
//
//            }
//            // Placement of array
//            arr[j+1]=current;
//        }
//
//        print(arr);
//    }
    public static void print(int[] arr){for(int x:arr){System.out.print(x+" ");}}

    static void main(String[] args) {
        int[] arr={7,8,3,1,2};

        for (int i = 0; i < arr.length; i++) {   // lenght=5, i=0
            int current=arr[i];                  // current=arr[0]-->current=7
            int j=i-1;                           // j=-1, then after j=1-1-->j=0--> So after again,j=2-1, j=1
            while(j>=0&& current <arr[j])  {     // current>arr[0]--> 7<7, then after again for, j=1--> 7>8,    While j=2, i=3,
                // After two iteration for index0 and 1, now for 2 index in third iteration, Now, j=3-1, j=2, i=3
                // Till now array is, {7,8,3,1,2}-->{7,8,"3","1",2}->Here 3 and 1 is compared
                // So for j=2, current<arr[2]--> 1<3, Here, Now after this, arr[j+1]=arr[j]-->arr[2+1]=arr[2]-->arr[3]=arr[2],
                arr[j+1]=arr[j];     // So, arr[3]=1. Here, array is= {7,8,1,3,2}
                j--;
            }
            // placement
            arr[j+1]=current;   // Here, if the comparing is false then it will be this like,
            //
        }
        print(arr);
    }}


