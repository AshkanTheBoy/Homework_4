package Homework4;

import java.util.Scanner;
/*
Программа запрашивает шестизначное число. После ввода определяет,
будет ли являться «счастливым» билет с таким номером (сумма первых трех цифр совпадает с суммой
трех последних).
 */
public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        //проверка ввода
        boolean status = true;

        while (status) {
            boolean isCorrect = true;
            System.out.println("Введите шестизначное число");
            String symbols = "~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?`\\/][';.,qwertyuiopasdfghjklzxcvbnmЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮёЁ";
            input = scanner.nextLine();
            //если в вводе есть символ - цикл начнется заново
            char[] toChar = symbols.toCharArray();
            for (char symbol : toChar) {
                CharSequence ch = String.valueOf(symbol);
                if (input.contains(ch)){
                    isCorrect = false;
                    break;
                }
            }
            //если длина и тип ввода верны - выпускаем из цикла
            if (input.length()==6 && isCorrect) {
                status = false;
            }
        }

        //делим строку пополам и даем значение int
        int first3 = Integer.parseInt(input.substring(0,3));
        int second3 = Integer.parseInt(input.substring(3));
        System.out.println(first3+" "+second3);

        //считаем сумму цифр в числах
        int sum1 = first3%10+(first3/10)%10+((first3/10)/10)%10;
        int sum2 = second3%10+(second3/10)%10+((second3/10)/10)%10;
        System.out.println(sum1+" "+sum2);

        if (sum1==sum2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }





    }
}
