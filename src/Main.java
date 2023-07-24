import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        findLeapYear(2021);
        findLeapYear(2024);
        upperApp(1, 2023);
        upperApp(0, 2017);
        printDistanceDay(75);
        printDistanceDay(270);

    }

    public static void findLeapYear(int year) {
        System.out.println("Задача 1 - узнаем какой год високосный");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void upperApp(int mobileOS, int year) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        String mobileOSName;

        switch (mobileOS) {
            case 0:
                mobileOSName = "iOS";
                break;
            case 1:
                mobileOSName = "Android";
                break;
            default:
                mobileOSName = "Неизвестная ОС";
        }

        if (year == currentYear) {
            System.out.println("Установите обычную версию приложения " + mobileOSName + " ОС");
        } else {
            System.out.println("Установите облегченную версию приложения " + mobileOSName + " ОС");
        }
    }
    public static int calcDistanceDay(int distance) {
        System.out.println("Задача 3");

        if (distance <= 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else if (distance > 100) {
            return -1;
        }
        return distance;
    }
    public static void printDistanceDay(int distance) {
        int day = calcDistanceDay(distance);

        if (day > 0) {
            System.out.println("Потребуется для доставки " + day + " дн");
        } else {
            System.out.println("Доставки нет");
        }
    }
    }