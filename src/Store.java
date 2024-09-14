public class Store {
    // Definir constantes para el umbral de ventas y los productos
    private static final int salesThreshold = 50;
    private static final int[] productosPrices = {15, 10, 5}; // Precios de productos
    private static final int[] ProductQuantities = {2, 3, 4}; // Cantidades vendidas de cada producto

    public static void main(String[] args) {
        int totalSales = 0;

        // Calcular las ventas totales usando un bucle
        for (int i = 0; i < productosPrices.length; i++) {
            totalSales += productosPrices[i] * ProductQuantities[i];
        }

        // Evaluar el rendimiento de las ventas
        if (totalSales > salesThreshold) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}

