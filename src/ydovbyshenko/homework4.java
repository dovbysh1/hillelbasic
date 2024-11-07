package ydovbyshenko;

public class homework4 {
    public static void main(String[] args) {
        byte number = 1;
        String productName = "smartphone";
        double productTotalSales = 12153.41;
        int productDays = 5;

        double productDailySales = productTotalSales / productDays;

        System.out.println("Product No " + number+ ": " + productName + ",");
        System.out.println("total sales for " + productDays + " days is EUR " + productTotalSales + ",");
        System.out.printf("sales by day is EUR %.2f.\n", productDailySales);

        number++;
        productName = "laptop";
        productTotalSales = 10486.85;
        productDays = 7;

        productDailySales = productTotalSales / productDays;

        System.out.println("Product No " + number+ ": " + productName + ",");
        System.out.println("total sales for " + productDays + " days is EUR " + productTotalSales + ",");
        System.out.printf("sales by day is EUR %.2f.", productDailySales);

    }
}
