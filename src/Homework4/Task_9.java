package Homework4;
/*
Даны координаты начала и координаты конца отрезка.
Если считать отрезок обозначением горки, то в одном случае он обозначает спуск, в другом – подъем. Определить и
вывести на экран – спуск это или подъем, ровная дорога или
вообще отвесная.
 */
public class Task_9 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        //Цикл против одинаковых точек 'x'
        do {
            x1 = (int) Math.round(Math.random() * 10);
            y1 = (int) Math.round(Math.random() * 10);
            x2 = (int) Math.round(Math.random() * 10);
            y2 = (int) Math.round(Math.random() * 10);
        } while (x1==x2);
        System.out.println(x1+" "+y1+"\n"+x2+" "+y2);

        if (y1<y2) {
            System.out.println("Подъем");
        } else if (y1==0 && y1==y2) {
            //наземная - y=0; отвесная - y>0
            System.out.println("Наземная дорога");
        } else if (y1==y2) {
            System.out.println("Отвесная дорога");
        } else {
            System.out.println("Спуск");
        }
    }
}
