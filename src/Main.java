import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreditCalcSrevice creditCalcSrevice = new CreditCalcSrevice();
        //тестовый раздел
        long payment_t1 = (long)Math.floor(creditCalcSrevice.calculate(1_000_000, 9.99F, 12));
        System.out.printf("Ежемесячный платёж: %s рублей \n", payment_t1);
        System.out.println("Процентная ставка: 9,99% \n");
        System.out.println("Длительность кредита в годах: 1 \n");
        long payment_t2 = (long)Math.floor(creditCalcSrevice.calculate(1_000_000, 9.99F, 24));
        System.out.printf("Ежемесячный платёж: %s рублей \n", payment_t2);
        System.out.println("Процентная ставка: 9,99% \n");
        System.out.println("Длительность кредита в годах: 1 \n");
        long payment_t3 = (long)Math.floor(creditCalcSrevice.calculate(1_000_000, 9.99F, 36));
        System.out.printf("Ежемесячный платёж: %s рублей \n", payment_t3);
        System.out.println("Процентная ставка: 9,99% \n");
        System.out.println("Длительность кредита в годах: 1 \n");
        // конец теста на данных клиента
        Scanner in = new Scanner(System.in);
        System.out.print("Введите запрашиваемую сумму кредита: ");
        long loanbody = in.nextLong();

        System.out.print("Введите длительность кредита в годах: ");
        int loanperiod = in.nextInt()*12;

        System.out.print("Введите процентную ставку: ");
        float loanppercent = in.nextFloat();
        in.close();

        float payment = creditCalcSrevice.calculate(loanbody, loanppercent, loanperiod);
        long paymentout = (long)Math.floor(payment);

        System.out.printf("Ежемесячный платёж: %s рублей \n", paymentout);
        System.out.printf("Процентная ставка: %s \n", loanppercent);
        System.out.printf("Длительность кредита в годах: %s \n", loanperiod/12);

    }
}
