package lesson22.classwork.example01;

// описывает продукт который будем покупать
public class Product {
   private int id;
    private double price;
    private String name;

    public Product(int id, String name, double price) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







}
