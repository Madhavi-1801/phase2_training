package prooo;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotal() {
        return price * quantity;
    }

    double applyDiscount(double percentage) {
        return calculateTotal() * percentage / 100;
    }

    void displayDetails() {
        System.out.println(
            productId + "\t" +
            productName + "\t\t₹" +
            price + "\t" +
            quantity + "\t₹" +
            calculateTotal()
        );
    }
}
public class billsystem{
	public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 800, 2);
        Product p3 = new Product(103, "Keyboard", 1500, 1);
        Product p4 = new Product(104, "Headphones", 2500, 3);
        Product p5 = new Product(105, "USB Cable", 500, 5);

        Product[] products = {p1, p2, p3, p4, p5};

        double subtotal = 0;
        double discount = 0;
        int totalItems = 0;

        Product expensive = products[0];
        Product cheapest = products[0];
        Product highestQuantity = products[0];

        System.out.println("------------- BILL -------------");
        System.out.println("ID\tName\t\tPrice\tQty\tTotal");

        for (Product p : products) {

            p.displayDetails();

            subtotal += p.calculateTotal();

            discount += p.applyDiscount(10);

            totalItems += p.quantity;

            if (p.price > expensive.price) {
                expensive = p;
            }

            if (p.price < cheapest.price) {
                cheapest = p;
            }

            if (p.quantity > highestQuantity.quantity) {
                highestQuantity = p;
            }
        }

        double amountAfterDiscount = subtotal - discount;

        double gst = amountAfterDiscount * 18 / 100;

        double finalAmount = amountAfterDiscount + gst;

        System.out.println("--------------------------------");

        System.out.println("Subtotal       : ₹" + subtotal);
        System.out.println("Discount (10%) : ₹" + discount);
        System.out.println("GST (18%)      : ₹" + gst);
        System.out.println("Final Bill     : ₹" + finalAmount);

        System.out.println("\n----------- SUMMARY -----------");

        System.out.println(
            "Most Expensive : " +
            expensive.productName
        );

        System.out.println(
            "Cheapest       : " +
            cheapest.productName
        );

        System.out.println(
            "Highest Quantity : " +
            highestQuantity.productName
        );

        System.out.println(
            "Total Items Purchased : " +
            totalItems
        );
    }
}

