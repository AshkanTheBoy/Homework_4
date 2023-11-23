package String;

public class Task9_12 {
    public static void main(String[] args) {
        /*
        Составить программу обмена значениями трех переменных величин а, b, c
        строкового типа по следующей схеме:
        а) b присвоить значение c, а присвоить значение b, c присвоить значение а;
        б) b присвоить значение а, с присвоить значение b, а присвоить значение c.
         */
        //a
        String a = "qwerty", b = "asdfgh", c = "zxcvbn";
        System.out.println(a+"\n"+b+"\n"+c);
        System.out.println();
        String a1 = a, b1 = b, c1 = c;
        b = c1;
        a = b1;
        c = a1;
        System.out.println(a+"\n"+b+"\n"+c);
    }
}
