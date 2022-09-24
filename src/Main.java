import java.time.LocalDate;

public class Main {

    // Домашнее задание Методы
    // Задание 1

    public static void countingTheYears (int year) {

        boolean everyFourthYear = (year % 4) == 0;
        boolean everyFourHundredthYear = (year % 400) == 0;
        if (everyFourthYear || everyFourHundredthYear) {
            System.out.println(year + " весокосный год");
        } else {
            System.out.println(year + " невесокосный год");
        }
        System.out.println();
    }

    // Задание 2
    public static void findOutTheVersion(int yearOfIssue, int iOS_0_android_1) {
        int os;
        int android = 1;
        int iOS = 0;
        if (iOS_0_android_1 == android) {
            os = android;
        } else {
            os = iOS;
        }
        int currentYear = LocalDate.now().getYear();
        if (yearOfIssue < currentYear) {
            switch (os) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для android по ссылке.");
                    break;
                default:
                    System.out.println("Такай операционной системы нет.");
            }
            System.out.println();
        } else {
            switch (iOS_0_android_1) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для android по ссылке.");
                    break;
                default:
                    System.out.println("Такай операционной системы нет.");
            }
        }
        System.out.println();
    }

    // Задание 3
    public static void bankCardDelivery(int deliveryDistance) {

        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println(day + " дней потребуется для доставки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println((day + 1) + " дней потребуется для доставки.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println((day + 2) + " дней потребуется для доставки.");
        }
    }
    public static void main(String[] args) {

        countingTheYears(2019);
        findOutTheVersion(2022, 0);
        bankCardDelivery(50);
    }
}