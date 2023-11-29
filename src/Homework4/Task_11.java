package Homework4;

import java.util.Scanner;

/*
Найти корни квадратного уравнения и вывести их на
экран, если они есть. Если корней нет, то вывести сообщение об этом. Конкретное квадратное уравнение определяется коэффициентами a, b, c, которые вводит пользователь с
клавиатуры.
 */
public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициенты a, b и c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = b*b-4*a*c;
        if (d>0) {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println(x1+" "+x2);
        } else if (d==0) {
            double x = (double)-b/(2*a);
            System.out.println(x);
        } else {
            System.out.println("Нет действительных корней");
        }
    }
}
