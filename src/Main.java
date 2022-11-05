public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }

        System.out.println();
        System.out.println("Задача 2");
        for (int a = 10; a >= 1; a--) {
            System.out.println("Число " + a);
        }

        System.out.println();
        System.out.println("Задача 3");
        for (int b = 0; b <= 17; b++){
            if(b % 2 == 0)
                System.out.println(b);
        }

        System.out.println();
        System.out.println("Задача 4");
        for (int c = 10; c >= -10; c--){
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Домашнее задание 2");
        System.out.println("Задача 1");
        for (int year = 1904; year <= 2096; year++){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }

        System.out.println();
        System.out.println("Задача 2");
        for (int d = 7; d < 100; d = d + 7){
            System.out.println(d);
        }

        System.out.println();
        System.out.println("Задача 3");
        for (int e = 1; e <= 512; e = e * 2){
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Домашнее задание 3");
        System.out.println("Задача 1 - 2");
        int money = 29000;
        int total = 0;
        for (int m = 0; m <= 12; m++) {
            total = total + total/100;
            total = total + money;
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей");
        }

    }
}