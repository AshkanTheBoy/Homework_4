package String;

public class String9_20 {
    /*
    Дано слово. Получить и вывести на экран буквосочетание, состоящее из его
    третьего и последнего символа.
    */
    public static void main(String[] args) {
        //Через индексы строки
        String a = "12345";
        String c = a.charAt(3-1)+""+a.charAt(a.length()-1);
        System.out.println(c);
        //Через индексы массива символов
        char[] b = a.toCharArray();
        c = b[3-1]+""+b[b.length-1];
        System.out.println(c);
    }
}
