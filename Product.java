class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product {

    int warranty;

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    void display() {
        displayProduct();
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Clothing extends Product {

    String size;
    String fabric;

    Clothing(String name, double price, String size, String fabric) {
        super(name, price);
        this.size = size;
        this.fabric = fabric;
    }

    void display() {
        displayProduct();
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }
}

public class Main {

    public static void main(String[] args) {

        Electronics e = new Electronics(
            "Laptop",
            55000,
            2
        );

        Clothing c = new Clothing("Shirt",1200,"L","Cotton");

        System.out.println("=== Electronics ===");
        e.display();

        System.out.println();

        System.out.println("=== Clothing ===");
        c.display();
    }
}