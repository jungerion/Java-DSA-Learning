public class SmallestLetterGreater {

    public static char nextGreatestLetter(char[] letters, char target){
        int start =0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            } else  {
                start=mid+1;
            }
        }
        // This right here is the wrap around using modulo. It makes the index 0.
        return letters[start%letters.length];
    }

    static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters,'a'));

        System.out.println(nextGreatestLetter(letters,'c'));
        System.out.println(nextGreatestLetter(letters,'f'));
        System.out.println(nextGreatestLetter(letters,'g'));
        System.out.println(nextGreatestLetter(letters,'t'));

    }
}
