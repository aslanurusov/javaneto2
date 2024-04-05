public class Main {
    public static void main(String[] args) {
        System.out.println("Начисление бонуса:");
        int amount = 250;
        System.out.println("Изначальная сумма на счету : " + amount + "рублей");
        int creditedAmount = 1600;
        System.out.println("Зачисление на счет суммы в " + creditedAmount + "рублей");
        System.out.println(" Бонус за зачисление 1600 рублей составляет:");
        int bonus;
        if (creditedAmount > 1000) {
            System.out.println(bonus = creditedAmount / 10);
        } else {
            bonus = 0;


        }


    }

}


