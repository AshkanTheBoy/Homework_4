package Homework4;

import java.util.Scanner;

public class Task_7alt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Не придумал варианта лучше, чем цикл для проверки длины строки
        //метод ".contains" требует тип CharSequence
        CharSequence input;
        do {
            System.out.println("Введите букву или цифру");
            input = scanner.nextLine();
        } while (input.length()>1);

        String lat = "qwertyuiopasdfghjklzxcvbnm";
        String cyrillic = "йцукенгшщзхъфывапролджэячсмитьбюё";
        String numbers = "1234567890";

            if (lat.contains(input)) {
                System.out.println("Латиница");
            } else if (cyrillic.contains(input)) {
                System.out.println("Кириллица");
            } else if (numbers.contains(input)) {
                System.out.println("Цифра");
            } else {
                System.out.println("Невозможно определить");
            }
        }
    }

