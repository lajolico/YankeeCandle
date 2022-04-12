/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author carol
 */
public class Product {
    
    private int id; 
    private String name; 
    private String description;
    private double price; 
    private int quantity; 
    private String image; 
    private int category_id;
    
public Product(int id, String name, String description, double price, int quantity, String image, int category_id) { 
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price; 
        this.quantity = quantity; 
        this.image = image; 
        this.category_id = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }
    
    public void decreaseQuantity() { 
        if(this.quantity > 0) { 
        this.quantity--;
        }
    }
    
}
