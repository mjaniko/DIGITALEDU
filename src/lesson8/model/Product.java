package lesson8.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * პროდუქტები
 *     სურათები
 *     დასახელება
 *     ფასი
 *     რაოდენობა
 *     ინგრედიენტები
 */
public class Product implements Serializable {

    private Category category;
    private List<String> photos = new ArrayList<>();
    private String productName = "";
    private String ingredients = "";
    private double price = 0.0;

    public Product(Category category, List<String> photos, String productName, String ingredients, double price) {
        this.category = category;
        this.photos = photos;
        this.productName = productName;
        this.ingredients = ingredients;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "პროდუქტის სახელი:"+this.productName+" ინგრედიენტები:"+this.ingredients+" ფასი:"+this.price;
    }
}
