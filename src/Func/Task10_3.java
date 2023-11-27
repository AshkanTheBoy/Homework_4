package Func;

public class Task10_3 {
    /*
    Определить значение z=max a,2b *max (2a-b),b x y — максимальное из чисел х, у.
    Задачу решить двумя способами:
    1) не используя функцию max;
    2) определив и использовав функцию max.
     */
    public static void main(String[] args) {
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        System.out.println(a+"\n"+b);
        int z;
        //1
        int c = 2*a-b;
        if (Math.min(c,b)==c){
            //z=max a,2b*b
            if (Math.min(a,2*b*b)==a){
                z = 2*b*b;
                System.out.println(z);
            }
            z = a;
            System.out.println(z);
        //z=max a,2b*c
        } else if (Math.min(a,2*b*c)==a){
            z = 2*b*c;
            System.out.println(z);
        } else {
            z = a;
            System.out.println(z);
        }

        //2
        z = Math.max(a,2*b*Math.max((2*a-b),b));
        System.out.println(z);
    }
}
