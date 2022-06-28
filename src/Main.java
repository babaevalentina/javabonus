public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; //начальный счет
        int deposit = 1200; //пополнение

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int resultAccount = initialAccount + deposit + bonus;
        System.out.println("Бонус - " + bonus);
        System.out.println("Итоговый счет - " + resultAccount);
    }
}
