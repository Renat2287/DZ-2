//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int topUpAmount = 1100;
        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        }
        int finalBalance = initialBalance + topUpAmount + bonus;
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счет: " + finalBalance);
    }
}