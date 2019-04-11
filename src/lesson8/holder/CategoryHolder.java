package lesson8.holder;

import lesson8.model.Category;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * კატეგორიის მონაცემთა ბაზა
 * იმპლემენტირებული Singletone დიზაინ პატერნით
 */
public class CategoryHolder {

    private static CategoryHolder instance = new CategoryHolder();

    private int identificator;

    private Map<Integer, Category> category = new HashMap<>();


    CategoryHolder() {
        this.identificator = 0;
    }


    /**
     * ვამატებთ კატეგორიას ჩვენს მონაცემთა ბაზაში
     * @param category
     */
    public void addCategory(Category category) {
        if(category == null){
            return;
        }

        this.identificator++; // ვზრდით იდენტიფიკატორის მნიშვნელპობას
        this.category.put(identificator, category);
    }

    public boolean removeCategoryById(int id){
        // მეტია ნულზე და ნაკლებია გადმოწოდებულ id -ზე მაგშემთხვევაში არ გვაქვს ელემენტი
        if(0 < identificator && identificator < id ){
            return false;
        }

        this.category.remove(id);
        return true;
    }

    public Category getCategoryById(int id){
        // მეტია ნულზე და ნაკლებია გადმოწოდებულ id -ზე მაგშემთხვევაში არ გვაქვს ელემენტი
        if(0 < this.identificator && this.identificator < id && this.category.containsKey(id)){
            return null;
        }
        return this.category.get(id);
    }

    public Collection<Category> getAllCategory(){
        return this.category.values();
    }

    public int getSize(){
        return this.category.size();
    }

    public static CategoryHolder getInstance() {
        return instance;
    }
}
