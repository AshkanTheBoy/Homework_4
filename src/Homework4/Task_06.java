package Homework4;

import java.util.Scanner;
/*
Определить количество дней в году, который вводит
пользователь, и вывести их в консоль. В високосном году –
366 дней, тогда как в обычном – 365. Високосными годами
являются все годы, делящиеся нацело на 4, за исключением
столетий, которые не делятся нацело на 400.
 */

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year%400==0){
            System.out.println("366");
        } else if (year%100==0) {
            System.out.println("365");
        } else if (year%4==0) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }
    }
}
