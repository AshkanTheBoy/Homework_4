package String;


import java.util.Arrays;

public class String9_31 {
    public static void main(String[] args) {
        String word1 = "вирус";
        String word2 = "фокус";
        //строку в массив
        char[] result = word1.toCharArray();
        //цикл для замены
        for (int i = 0; i<word1.length(); i++){
            result[i] = word2.charAt(i);
            //если "слова" равны раньше окончания цикла - выходим
            if (Arrays.equals(result,word2.toCharArray())) {
                break;
            }
            System.out.println(result);
        }
        System.out.println(result);
    }
}
