package String;

public class String9_70 {
    public static void main(String[] args) {
        String word = "qwertyuioEEEEE";
        System.out.println(word);
        //слово в ловеркейс
        word = word.toLowerCase();
        System.out.println(word);
        //слово в буквенный массив
        char[] wordInChar = word.toCharArray();
        int count = 0;
        char[] vowels = {'a','e','i','o','u','y',};
        //в цикле сравниваем букву и "гласную", если совпадают - +1 гласная
        for (char wordChar : wordInChar) {
            for (char vowel : vowels) {
                if (wordChar==vowel) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
