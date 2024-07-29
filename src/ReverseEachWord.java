public class ReverseEachWord {

    public static void main(String[] args) {

        String word="I am in Berlin";

        reverseEachWord(word);
    }
    private static void reverseEachWord(String word) {
        String[] words =word.split(" ");
        for(int i=0; i< words.length;i++ ){
            System.out.print(reverseString(words[i])+" ");
        }

    }
    private static String reverseString(String word) {
        String revWord="";
        for(int i=word.length()-1;i>=0;i--){
            revWord=revWord+word.charAt(i);
        }

        return revWord;
    }
}
