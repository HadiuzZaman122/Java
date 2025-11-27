import java.util.Scanner;
class Product {
    int productId;

    Product(int id) {
        this.productId = id;
    }

    void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}
class Electronics extends Product {
    int warranty;

    Electronics(int id, int w) {
        super(id);
        this.warranty = w;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Warranty: " + warranty + " years");
    }
}
class ProductMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Warranty (years): ");
        int w = sc.nextInt();

        Electronics e = new Electronics(id, w);
        e.showDetails();

        sc.close();
    }
}