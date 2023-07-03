public class CreditPaymentService {
    public double calculate(int years, double interest, int amount) {

        double payment = amount * interest / 12 / 100 * Math.pow(1 + interest / 12 / 100, years * 12) / (Math.pow(1 + interest / 12 / 100, years * 12) - 1);
        return payment;

    }
}
