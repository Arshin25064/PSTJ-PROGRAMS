import java.util.*;

class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }
}
class Order {
    int orderId;
    String productName;
    int quantity;
    int availableStock;

    Order(int orderId, String productName, int quantity, int availableStock) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.availableStock = availableStock;
    }

    public void processOrder() throws InsufficientStockException {
        if (quantity > availableStock) {
            throw new InsufficientStockException("Insufficient stock");
        }
    }
}

public class TASK_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String product = sc.next();
            int quantity = sc.nextInt();
            int stock = sc.nextInt();

            Order order = new Order(id, product, quantity, stock);

            try {
                order.processOrder();
                System.out.println("Order " + id + " processed successfully");
            } catch (InsufficientStockException e) {
                System.out.println("Order " + id + " failed: " + e.getMessage());
            }
        }
    }
}