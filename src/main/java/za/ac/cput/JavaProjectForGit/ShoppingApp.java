package za.ac.cput.JavaProjectForGit;

/**
 * 217205135 Branch
 * Khanya Gibisela- 217205135
 *
 */

public class ShoppingApp {


    /*
     * The class and methods below demonstrate two objects equality and identity.
     */
public static class Product{
    public String itemName;
    private double price;

    public Product (String barCode, double price){
        this.itemName = itemName;
        this.price = price;

    }
    public boolean equals(Product p){
        return (p.itemName == itemName) && (p.price == price);
    }

}
}
