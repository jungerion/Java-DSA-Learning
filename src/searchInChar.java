public class searchInChar {

    public static Character search(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){return str.charAt(i);}
        }
        return null;
    }

    static void main(String[] args) {
        String name="Aakrit Jung Shah";
        char target='k';
        Character res=search(name,target);
        System.out.println(res!=null?"Character in the string is: "+res:"Character not found in the string!");
    }
}
