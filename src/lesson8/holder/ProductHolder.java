package lesson8.holder;

import lesson8.model.Product;

import java.util.*;

/**
 * პროდუქტების მონაცემთა ბაზა
 * იმპლემენტირებული Singletone დიზაინ პატერნით
 */
public class ProductHolder {

    private static ProductHolder instance = new ProductHolder();

    private int identificator;

    private Map<Integer, Product> products = new HashMap<>();


    ProductHolder() {
        this.identificator = 0;
    }


    /**
     * ვამატებთ პროდუქტს ჩვენს მონაცემთა ბაზაში
     * @param product
     */
    public void addProduct(Product product) {
        if(product == null){
            return;
        }

        this.identificator++; // ვზრდით იდენტიფიკატორის მნიშვნელპობას
        this.products.put(identificator, product);
    }

    public boolean removeProductById(int id){
        // მეტია ნულზე და ნაკლებია გადმოწოდებულ id -ზე მაგშემთხვევაში არ გვაქვს ელემენტი
        if(0 < identificator && identificator < id ){
            return false;
        }

        this.products.remove(id);
        return true;
    }

    public Product getPorduct(int id){
        // მეტია ნულზე და ნაკლებია გადმოწოდებულ id -ზე მაგშემთხვევაში არ გვაქვს ელემენტი
        if(0 < this.identificator && this.identificator < id && this.products.containsKey(id)){
            return null;
        }
        return this.products.get(id);
    }

    public Collection<Product> getAllProduct(){
        return this.products.values();
    }

    public int getSize(){
        return this.products.size();
    }

    public static ProductHolder getInstance() {
        return instance;
    }


}
