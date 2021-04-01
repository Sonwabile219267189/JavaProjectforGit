package za.ac.cput.JavaProjectForGit;

/**
 * 217205135 Branch
 * Khanya Gibisela- 217205135
 *
 */

public class ShoppingApp {
    public static void main(String[] args) {

        Product p1 = new Product("Hand sanitizer",70.00);
        Product p2 = new Product ("Mask",25.00);

        System.out.println(p1 == p2);//equality
        System.out.println(p1.equals(p2)); // identity


    }

        /*
         * The class and methods below demonstrate two objects equality and identity.
         */

        public static class Product {
            public String itemName;
            private double price;

            public Product(String itemName, double price) {
                this.itemName = itemName;
                this.price = price;

            }

            public boolean equals(Product p) {
                return (p.itemName == itemName) && (p.price == price);
            }

        }
    }


