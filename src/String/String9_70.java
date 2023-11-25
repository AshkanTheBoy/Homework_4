package String;

public class String9_70 {
    public static void main(String[] args) {
        String word = "qwertyuioEEEEE";
        System.out.println(word);
        word = word.toLowerCase();
        System.out.println(word);
        char[] wordInChar = word.toCharArray();
        int count = 0;
        char[] vowels = {'a','e','i','o','u','y',};
        for (int i = 0; i<word.length(); i++) {
            for (int j = 0; j<vowels.length; j++){
                if (wordInChar[i]==vowels[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
