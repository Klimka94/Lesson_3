import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int clientOS = 1; //Задача 1
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Ошибка инициализации устройства");
            }

        int phoneReleased = 2016; //Задача 2
            if (clientOS == 1 && phoneReleased >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else if (clientOS == 1 && phoneReleased < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else if (clientOS == 0 && phoneReleased >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else if (clientOS == 0 && phoneReleased < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Ошибка");
            }

        int year = 1300; //Задача 3
            if (( year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Год високосный");
            }
            else {
                System.out.println("Год не високосный");
            }

        int deliveryDistance = 95;//Задача 4
        int daysDelivery = 0;
          if (deliveryDistance <= 20) {
              daysDelivery = daysDelivery + 1;
              System.out.println("Доставка займёт дней: " + daysDelivery);
          }
          else if (deliveryDistance > 20 && deliveryDistance <= 60) {
             daysDelivery = daysDelivery + 2;
              System.out.println("Доставка займёт дней: " + daysDelivery);
          }
          else if (deliveryDistance > 60 && deliveryDistance <= 100) {
              daysDelivery = daysDelivery + 3;
              System.out.println("Доставка займёт дней: " + daysDelivery);
          }
          else {
              System.out.println("Доставка займёт больше трёх дней");
          }

        int month = 6; //Задача 5
          switch (month) {
              case 1:
              case 2:
              case 12:
                  System.out.println("Зима");
                  break;
              case 3:
              case 4:
              case 5:
                  System.out.println("Весна");
                  break;
              case 6:
              case 7:
              case 8:
                  System.out.println("Лето");
                  break;
              case 9:
              case 10:
              case 11:
                  System.out.println("Осень");
                  break;
              default:
                  System.out.println("Такого месяца нет!");
          }

        int age = 19; //Задача 6
        int salary = 58000;
          if (age < 23) {
            if (salary >= 80000) {
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary*2*1.5 + " рублей.");
            }
            else if (salary >= 50000) {
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary*2*1.2 + " рублей.");
            }
            else {
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary*2 + " рублей.");
            }
          }
          else {
            if (salary >= 80000) {
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary*3*1.5 + " рублей.");
            }
            else if (salary >= 50000) {
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary*3*1.2 + " рублей.");
            }
            else {
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary*3 + " рублей.");
            }
        }

        int age1 = 31; //Задача 7
        int salary1 = 10000;
        int wantedSum = 12000;
        double baseRate = 0.1;
        double monthlyPaymentAfford = salary1/2;
          if (age1 < 30) {
              baseRate = baseRate + 0.005;
          }
          else if (age1 < 23) {
              baseRate = baseRate + 0.01;
          }
          else if (salary1 > 80000) {
              baseRate = baseRate - 0.007;
          }
        double monthlyPaymentCredit = ((wantedSum*baseRate)+wantedSum)/12;
          if (monthlyPaymentCredit<=monthlyPaymentAfford) {
              System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + monthlyPaymentAfford + " рублей. Платеж по кредиту " + monthlyPaymentCredit + " рублей. Одобрено");
          }
          else {
              System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + monthlyPaymentAfford + " рублей. Платеж по кредиту " + monthlyPaymentCredit + " рублей. Отказано");
          }
    }
}