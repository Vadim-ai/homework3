public class Main {
    public static void main(String[] args) {

        //Task 1
        int clientOS = 0;

        switch (clientOS) {

            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;

            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;

        }
        // Task 2
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Что-то пошло не так, попробуйте еще раз");

        }

        //Task 3

        int year = 1600;
        if (year % 4 != 0 || (year % 100 == 0) && (year % 400 != 0)) {
                    System.out.println(year + " год не является високосным");
                } else {
            System.out.println(year + " год является високосным");
        }

      //task 4
        int deliveryDistance = 99 ;
        int deliveryDays = 1;


        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                    deliveryDays = deliveryDays + 2;
                    System.out.println("Потребуется дней: " + deliveryDays);
                }

        //task 5
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");


        }

        //Lesson 3 : Task 6
        {
            int age = 19;
            int salary = 58_000;

            if (age < 18) {
                System.out.println("Иди в школу... Тебе не нужен кредит, успеешь еще"); //банк же заботливый, а ограничение забыл
            } else if (age < 23) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей");
            } else if (age >= 23) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
            } else if (age < 23 && salary >= 50000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 2) * 1.2) + " рублей");
            } else if (age < 23 && salary >= 80000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 2) * 1.5) + " рублей");
            } else if (age >= 23 && salary >= 50000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 3) * 1.2) + " рублей");
            } else if (age >= 23 && salary >= 80000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 3) * 1.5) + " рублей");
            }

        }


        //Lesson 3 : Task 7
        {
            double baseRate = 1.1;
            double creditPeriod = 12.0;
            double salary = 60_000.0;
            double age = 25.0;
            double wantedSum = 330_000.0;
            double paymentLimit = salary / 2;
            double creditPaymentPerMonth;
            String check;

            if (age < 23) {
                baseRate = baseRate + 0.01;


            } else if (age < 30 ) {
                baseRate = baseRate + 0.005;
            }

            if (salary > 80000) {
                baseRate = baseRate - 0.007;
            }

            creditPaymentPerMonth = (wantedSum * baseRate) / creditPeriod;

            if (paymentLimit > creditPaymentPerMonth) {
                check = "Одобрено";
            } else {
                check = "Отказ";
            }

            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + paymentLimit + " рублей. Платеж по кредиту " + creditPaymentPerMonth + " рублей." + check);
        }
    }
}










