package String;

public class String9_20 {
    /*
    Дано слово. Получить и вывести на экран буквосочетание, состоящее из его
    третьего и последнего символа.
    */
    public static void main(String[] args) {
        String a = "12345";
        String c = a.substring(3-1,4-1)+""+a.substring(a.length()-1);
        System.out.println(c);
        char[] b = a.toCharArray();
        c = b[3-1]+""+b[b.length-1];
        System.out.println(c);
    }
}
