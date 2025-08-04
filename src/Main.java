//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear > 2015 ) {
            System.out.printf("Установите версию приложения для IOS по ссылке ниже");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.printf("Установите облегченную верcию приложения для IOS по ссылке ниже");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.printf("Установите версию приложения для Android по ссылке ниже");
        }else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.printf("Установите облегченную версию приложения для Android по ссылке ниже");
        }

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf(year + "год является високосным");
        }else{
            System.out.printf(year + "год не является високосным");
        }
    }
}




