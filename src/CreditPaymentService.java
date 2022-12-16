public class CreditPaymentService {
    public double canculate(double amount, double percent, double month) {
        double i = (percent/100) * ((month / 12) / month);
        double k = i + i / (Math.pow(1 + i, month) - 1);
        double a = k * amount;

        return a;
    }
}
