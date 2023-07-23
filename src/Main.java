import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        findLeapYear(2021);
        findLeapYear(2024);
        upperApp(1, 2023);
        calcDistanceDay(75);

    }

    public static void findLeapYear(int year) {
        System.out.println("Задача 1 - узнаем какой год високосный");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

        public static void upperApp(int OS, int year) {
            System.out.println("Задача 2");
            int currentYear = LocalDate.now().getYear();

            switch (OS) {
                case 0:
                    System.out.println("iOS");
                case 1:
                    System.out.println("Android");
            }

            if (year == currentYear) {
                System.out.println("Установите облегченную версию приложения");
            } else {
                System.out.println("Установите полную версию приложения");
            }
        }
    public static void calcDistanceDay(int distance) {
        System.out.println("Задача 4");
        int day = 0;

        if (distance <= 20) {
            System.out.println("Потребуется дней " + day + 1);
        } else if (distance < 60) {
            System.out.println("Потребуется дней " + day + 2);
        } else if (distance <= 100) {
            System.out.println("Потребуется дней " + day + 3);
        } else if (distance > 100) {
            System.out.println("Доставки нет");
        }
    }
    }