public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000; // сумма кредита
        double percent = 9.99/100; // проценты, переведенные в число для расчетов
        double month = 12; // срок взятия
        int payment = (int) service.canculate(amount, percent, month); // аннуитетный платёж

        System.out.println( (int) service.canculate(1_000_000, 9.99/100, 12));
        System.out.println( (int) service.canculate(1_000_000, 9.99/100, 24));
        System.out.println( (int) service.canculate(1_000_000, 9.99/100, 36));
    }
}
