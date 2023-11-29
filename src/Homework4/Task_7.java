package Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Пользователь вводит с клавиатуры букву. Программа
должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».
 */
public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Не придумал варианта лучше, чем цикл для проверки длины строки
        String input;
        do {
            System.out.println("Введите букву или цифру");
            input = scanner.nextLine();
        } while (input.length()>1);

        //Через регулярное выражение
        //при некоторых символах выдает либо "Латиница", либо ошибку
        Pattern letter = Pattern.compile(input, Pattern.CASE_INSENSITIVE);
        Matcher lat = letter.matcher("qwertyuiopasdfghjklzxcvbnm");
        boolean letterFound = lat.find();
        if (letterFound) {
            System.out.println("Латиница");
        } else {
            Matcher cyrlic = letter.matcher("йцукенгшщзхъфывапролджэячсмитьбюё");
            letterFound = cyrlic.find();
            if (letterFound) {
                System.out.println("Кириллица");
            } else {
                Matcher numbers = letter.matcher("1234567890");
                letterFound = numbers.find();
                if (letterFound) {
                    System.out.println("Цифра");
                } else {
                    System.out.println("Невозможно определить");
                }
            }
        }
    }
}
