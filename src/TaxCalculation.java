public class TaxCalculation {
    
    // Constantes
    public static final double TAX_RATE_HIGH = 0.15; 
    public static final double TAX_RATE_LOW = 0.10;  
    public static final double TAX_THRESHOLD = 50.0;  

    public static void main(String[] args) {
       
        double[] productPrices = {100, 200};           
        double[] taxRates = {TAX_RATE_HIGH, TAX_RATE_LOW}; 

        double totalTax = calculateTotalTax(productPrices, taxRates);

        // Matrices para almacenar precios de productos y tasas impositivas.
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }

 
    public static double calculateTotalTax(double[] prices, double[] rates) {
        double totalTax = 0.0;
        
        // Aseguramos de que la longitud de ambas matrices sea igual
        if (prices.length != rates.length) {
            throw new IllegalArgumentException("Prices and rates arrays must have the same length.");
        }
        
        // Miramos cada producto y calculamos el impuesto
        for (int i = 0; i < prices.length; i++) {
            totalTax += prices[i] * rates[i];
        }
        
        return totalTax;
    }
}
