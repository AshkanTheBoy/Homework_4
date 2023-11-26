package ZlatoPolska;

public class Task3_34 {
    public static void main(String[] args) {
        int a,b,c,d;
        //цикл против одинаковых координат
        do {
            a = (int)Math.round(Math.random()*7+1);
            b = (int)Math.round(Math.random()*7+1);
            c = (int)Math.round(Math.random()*7+1);
            d = (int)Math.round(Math.random()*7+1);
        } while (a==c && b==d);
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
        //a "ладья"
        boolean canItCapture = (a==c)||(b==d);
        System.out.println(canItCapture);
        //b "слон"
        //xca и ydb - модули разностей координат
        int xca = Math.abs(c-a);
        int ydb = Math.abs(d-b);
        canItCapture = Math.abs(c-a)==Math.abs(d-b);
        System.out.println(canItCapture);
        //c "король"
        //1 - диагонали, 2 - по бокам, 3 - сверху/снизу
        canItCapture = (xca==1 && ydb==1)||(xca==1 && ydb==0)||(xca==0 && ydb==1);
        System.out.println(canItCapture);
        //d "ферзь"
        //комбинация a и b
        canItCapture = ((a==c)||(b==d))^(xca==ydb);
        System.out.println(canItCapture);
        //e "белая пешка"
        //1 - ход на 2 клетки, 2 - обычный ход, 3 - если бьет фигуру спереди
        canItCapture = (a==c && b==2 && d==4)||(a==c && ydb==1)||((c-a==-1 && d-b==1)||(c-a==1 && d-b==1));
        System.out.println(canItCapture);
        //f "черная пешка"
        //1 - ход на 2 клетки, 2 - обычный ход, 3 - если бьет фигуру спереди
        canItCapture = (a==c && b==7 && d==5)||(a==c && ydb==1)||((c-a==1 && d-b==-1)||(c-a==-1 && d-b==-1));
        System.out.println(canItCapture);
        //g "конь"
        canItCapture = (xca == 2 && ydb == 1) || (xca == 1 && ydb == 2);
        System.out.println(canItCapture);
    }
}
