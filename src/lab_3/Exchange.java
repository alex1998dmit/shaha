package lab_3;
import java.text.DecimalFormat;

public class Exchange {

        //    public static void exchange(String paymentName, double incomeCurr, double incomeRub) {
        public static void main(String[] args) {
            DecimalFormat f = new DecimalFormat("##.##");
            String paymentName = "Dollars";
            double incomeCurr = 60.78;
            double incomeRub = 30000;
            double paymentSize = incomeRub / incomeCurr;
            System.out.println("--------Exchanger-----");
            System.out.println("Rubles: " + incomeRub);
            System.out.println("Currency: " + incomeCurr);
            System.out.println(paymentName + ": " + f.format(paymentSize));
            System.out.println("----------------------");
    }
}

