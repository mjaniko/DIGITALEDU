package lesson8.holder;

import lesson8.model.Category;
import lesson8.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuHolder {

    private static MenuHolder instance = new MenuHolder();

    private Map<Category, List<Product>> menu = new HashMap<>();

    public static MenuHolder getInstance() {
        return instance;
    }

    /**
     * ვამატებთ კატეგორიებს
     * @param category
     */
    public void addCategory(Category category){
        if(!menu.containsKey(category)) {
            this.menu.put(category, new ArrayList<>());
        }
    }

    /**
     * ვამატებთ კატეგორიაში პროდუქტს
     * @param category
     * @param product
     */
    public void addMenuItem(Category category, Product product){
        if (category == null || product == null){
            return;
        }

        // ვამოწმებ გვაქვს თუ არა კატეგორია
        if(menu.containsKey(category)){
            // თუ გვაქვს ესეიგი ვამატებ პროდუქტს
            menu.get(category).add(product);
        } else {
            // ვქმნით თუ კატეგორია არ არსებობს
            menu.put(category, new ArrayList<>());
            // ვამატებთ შექმნილ კატეგორიაში
            menu.get(category).add(product);
        }
    }


    /**
     * მოგვაქვს ყველა პროდუქტი კატეგორიის მიხედვით
     * @param category
     * @return
     */
    public List<Product> getProductsByCategory(Category category){
        if(!menu.containsKey(category)){
            return new ArrayList<>();
        }
        return menu.get(category);
    }


    public Map<Category, List<Product>> getMenu(){
        return this.menu;
    }


}
