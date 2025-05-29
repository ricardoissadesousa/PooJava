package introducaoPoo.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(){
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public double totalVlueInStock(){
        return quantity * price;
    }
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
        public String toString(){
        return name
                +", $"
                +String.format("%.2f", price)
                +", "
                +quantity
                +" units, total: $"
                +String.format("%.2f", totalVlueInStock());
        }
    }
