public class Main {
    public static void main(String[] args) {
        char clientOS1 = 3;
        if (clientOS1 == 0)
            System.out.println("Установите версию приложения для iOS по сссылке");
        else if (clientOS1 == 1) ;
        System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println("Введены неверные параметры");
        System.out.println(

        );

        char clientOS = 0;
        char clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Введены неверные параметры");
            System.out.println(

            );
        }
        int year = 100;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным.");
        } else {
            System.out.println("Год " + year + " не является високосным.");
            System.out.println(

            );
        }
        int deliveryDistance = 100;
        int EstimatedDeliverytime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Срок доставки " + EstimatedDeliverytime + " день.");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Срок доставки " + (EstimatedDeliverytime + 1) + " дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Срок доставки " + (EstimatedDeliverytime + 2) + " дня.");
        } else {
            System.out.println("Доставки нет.");
            System.out.println(

            );
        }
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
                System.out.println("Зимний сезон");
                break;
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
                System.out.println("Весенний сезон");
                break;
            case 4:
                System.out.println("Весенний сезон");
                break;
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
                System.out.println("Летний сезон");
                break;
            case 7:
                System.out.println("Летний сезон");
                break;
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
                System.out.println("Осенний сезон");
                break;
            case 10:
                System.out.println("Осенний сезон");
                break;
            case 11:
                System.out.println("Осенний сезон");
                break;
            case 12:
                System.out.println("Зимний сезон");
                break;
            default:
                System.out.println("данного месяца не существует");
        }}}