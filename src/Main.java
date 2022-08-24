public class Main {
  // Задание 3
    public static void main(String[] args) {

        int year = 2021;

        if (year / 4 == 0 && year / 100 != 0 || year / 400 == 0) {
     System.out.println(year + "является высокосным");
 } else {
      System.out.println(year + "не является высокосным");
}
}
}