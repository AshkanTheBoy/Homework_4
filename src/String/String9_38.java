package String;

public class String9_38 {
    public static void main(String[] args) {
        String word = "123456789012";
        System.out.println(word);
        System.out.println();
        word = word.substring(4,8)+word.substring(8,12)+word.substring(0,4);
        System.out.println(word);
    }
}
