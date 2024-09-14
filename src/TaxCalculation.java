public class TaxCalculation {
    public static void main(String[] args) {
        double productPrice1 = 100;
        double productPrice2 = 200;
        double taxRateHigh = productPrice1 * 0.15;
        double taxRateLow = productPrice2 * 0.10;
        double totalTax = taxRateHigh + taxRateLow;
        
        if (totalTax > 50) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
