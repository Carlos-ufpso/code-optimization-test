public class Store {

    // aplicamos las constantes
    public static final int PRICE_PRODUCT1 = 15;
    public static final int PRICE_PRODUCT2 = 10;
    public static final int PRICE_PRODUCT3 = 5;
    public static final int QUANTITY_PRODUCT1 = 2;
    public static final int QUANTITY_PRODUCT2 = 3;
    public static final int QUANTITY_PRODUCT3 = 4;
    public static final int SALES_THRESHOLD = 50;

    public static void main(String[] args) {
        // matrices para almacenar precios y cantidades de productos.
        int[] productPrices = {PRICE_PRODUCT1, PRICE_PRODUCT2, PRICE_PRODUCT3};
        int[] productQuantities = {QUANTITY_PRODUCT1, QUANTITY_PRODUCT2, QUANTITY_PRODUCT3};

        //calculamos las ventas totales mediante un bucle
        int totalSales = calculateTotalSales(productPrices, productQuantities);

        // Determinar el rendimiento de ventas
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }

    public static int calculateTotalSales(int[] prices, int[] quantities) {
        int totalSales = 0;

        // Nos aseguramos de que las longitudes de ambas matrices sean iguales
        if (prices.length != quantities.length) {
            throw new IllegalArgumentException("Prices and quantities arrays must have the same length.");
        }

        // Calculamos el total de ventas
        for (int i = 0; i < prices.length; i++) {
            totalSales += prices[i] * quantities[i];
        }

        return totalSales;
    }
}
