//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача №1
        byte clientOS = 0;
        if (clientOS == 0 ) {
            System.out.printf("   Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == 1 ) {
            System.out.printf("   Установите версию приложения для Android по ссылке");
        }
        // Задача №2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear > 2015 ) {
            System.out.printf("   Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.printf("   Установите облегченную верcию приложения для IOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.printf("   Установите версию приложения для Android по ссылке");
        }else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.printf("   Установите облегченную версию приложения для Android по ссылке");
        }
        // Задача №3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf(year + "   год является високосным");
        }else{
            System.out.printf(year + "   год не является високосным");
        }
        // Задача №4
        int deliveryDistance = 95;
        byte dase = 1;
        if (deliveryDistance <20){
            System.out.printf("   На доставку карты понадобится дней : " + dase);
        }else if (deliveryDistance >=20 && deliveryDistance<60){
            dase = (byte) (dase + 1);
            System.out.printf("   На доставку карты понадобится дней : " + dase);
        }
        if (deliveryDistance >= 60 && deliveryDistance <=100){
            dase = (byte) (dase + 1);
            System.out.printf("   На доставку карты понадобится дней : " + dase);
        }else if (deliveryDistance > 100){
            System.out.printf("   К сожалению мы не сможем доставить вам карту");
        }
        // Задача №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.printf("   Зима");
                break;
            case 2:
                System.out.printf("   Зима");
                break;
            case 3:
                System.out.printf("   Весна");
                break;
            case 4:
                System.out.printf("   Весна");
                break;
            case 5:
                System.out.printf("   Весна");
                break;
            case 6:
                System.out.printf("   Лето");
                break;
            case 7:
                System.out.printf("   Лето");
                break;
            case 8:
                System.out.printf("   Лето");
                break;
            case 9:
                System.out.printf("   Осень");
                break;
            case 10:
                System.out.printf("   Осень");
                break;
            case 11:
                System.out.printf("   Осень");
                break;
            case 12:
                System.out.printf("   Зима");
                break;
        }


    }
}