package Homework4;
/*
Написать программу, которая предлагает пользователю
ввести c клавиатуры номер дня недели, и в ответ показывает название этого дня (например, 6 – это суббота).
Решить с использованием switch.
 */
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do { System.out.println("Введите номер дня недели");
            input = scanner.nextInt();
        } while (input<1 || input>7);

        switch (input){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
    }
}
