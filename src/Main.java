public class Main {
  // Задание 3
    public static void main(String[] args) {
        task2();
    }
    public static void task1() {
    int year = 2021;

        if (year / 4 == 0 && year / 100 != 0 || year / 400 == 0) {
            System.out.println(year + "является высокосным");
        } else {
            System.out.println(year + "не является высокосным");
        }
    }
    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2020;
        if (clientOS == 0) {

         if (clientDeviceYear < 2015) {

             System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         } else {
             System.out.println("Установите версию приложения для iOS по ссылке");
         }
        } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }
}

