public class SearchInStrings {
// This for actually printing the elements in the Strings

    public static String search(String[] str,String target){
        for(String x:str){
            if(x.equals(target)){return x;}
        }
        return null;
    }

    static void main(String[] args) {
        String[] names={"Aakrit","Jung","Shah","Soncia"};
        String target="Shah";
        String res=search(names,target);
        System.out.println(res!=null?"Element is: "+res:"Element not found");
    }

    // This for searching the index at where is the String, index
//    public static int searchString(String[] arr, String target){
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].equals(target)){return i;}
//        }
//        return -1;
//    }
//
//    static void main(String[] args) {
//    String[] names={"Aakrit","Jung","Shah"};
//    String target="Shah";
//
//    int result= searchString(names,target);
//        System.out.println(result==-1?"Element not found":"Element found at index: "+result);
//    }
}
