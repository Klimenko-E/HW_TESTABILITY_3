
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int years = 1;
        double interest = 9.99;
        int amount = 1_000_000;
        double payment = service.calculate(years, interest, amount);
        System.out.println("Ежемесячный платеж " + (int) payment);
        System.out.println();

        years = 2;
        interest = 9.99;
        amount = 1_000_000;
        payment = service.calculate(years, interest, amount);
        System.out.println("Ежемесячный платеж " + (int) payment);
        System.out.println();

        years = 3;
        interest = 9.99;
        amount = 1_000_000;
        payment = service.calculate(years, interest, amount);
        System.out.println("Ежемесячный платеж " + (int) payment);

    }
}