package lesson8;

import lesson7.AnsiColors;
import lesson8.holder.CategoryHolder;
import lesson8.holder.MenuHolder;
import lesson8.holder.ProductHolder;
import lesson8.model.Category;
import lesson8.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * მენიუ
 *
 * კატეგორიის სახელი
 *
 * პროდუქტები
 *     სურათები
 *     დასახელება
 *     ფასი
 *     რაოდენობა
 *     ინგრედიენტები
 */
public class MenuManager {




    public static void main(String[] args) {

        Category comi = new Category("ცომეული");
        Category drink = new Category("სასმელი");

        List<String> pizzaPhotos = new ArrayList<>();
        pizzaPhotos.add("https://image.shutterstock.com/z/stock-photo-poizza-oven-223537666.jpg");
        pizzaPhotos.add("https://image.shutterstock.com/z/stock-photo-poizza-oven-223537666.jpg");
        Product pizza = new Product(comi, pizzaPhotos, "პიცა", "ცომი,ყველი,ძეხვი", 17.9);

        List<String> xachapuriPhotos = new ArrayList<>();
        xachapuriPhotos.add("https://gemrielia.ge/media/__sized__/images/%E1%83%AE%E1%83%90%E1%83%AD%E1%83%90%E1%83%9E%E1%83%A3%E1%83%A0%E1%83%98-crop-c0-5__0-5-450x301-70.jpg");
        xachapuriPhotos.add("http://ratatui.ge/wp-content/uploads/2015/07/11083612_874156305941208_5141365070482705719_n.jpgg");

        Product xachapuri = new Product(comi, xachapuriPhotos, "ხაჭაბპური", "ცომი,ყველი", 6.0);

        List<String> cocaColaphotos = new ArrayList<>();
        xachapuriPhotos.add("https://gemrielia.ge/media/__sized__/images/%E1%83%AE%E1%83%90%E1%83%AD%E1%83%90%E1%83%9E%E1%83%A3%E1%83%A0%E1%83%98-crop-c0-5__0-5-450x301-70.jpg");
        xachapuriPhotos.add("http://ratatui.ge/wp-content/uploads/2015/07/11083612_874156305941208_5141365070482705719_n.jpgg");

        Product cola = new Product(drink, cocaColaphotos, "კოკა-კოლა", "ცეცხლი,ნავთი", 3.0);

        // პრუდუქტების მონაცემთა ბაზაში შეგვაქვს პროდუქტი
        ProductHolder.getInstance().addProduct(pizza);
        ProductHolder.getInstance().addProduct(xachapuri);
        ProductHolder.getInstance().addProduct(cola);
        ProductHolder.getInstance().addProduct(cola);
        ProductHolder.getInstance().addProduct(cola);
        ProductHolder.getInstance().addProduct(cola);

        // კატეგორიების მონაცემთა ბაზაში შეგვაქვს კატეგორია
        CategoryHolder.getInstance().addCategory(comi);
        CategoryHolder.getInstance().addCategory(drink);

        // შევავსოთ კატეგორიები პროდუქტებით
        for(Category cat: CategoryHolder.getInstance().getAllCategory()){
            MenuHolder.getInstance().addCategory(cat);
        }

        // შევავსოთ კატეგორიები პროდუქტებით
        for(Product prod: ProductHolder.getInstance().getAllProduct()){
            MenuHolder.getInstance().addMenuItem(prod.getCategory(), prod);
        }


        System.out.println(AnsiColors.ANSI_GREEN+"[ჩვენი მენიუ]");
        System.out.println(AnsiColors.ANSI_RED+"[------------]");
        for(Map.Entry<Category, List<Product>> entrySet: MenuHolder.getInstance().getMenu().entrySet()){
            System.out.println(AnsiColors.ANSI_PURPLE+entrySet.getKey().getTitle());
            System.out.println();
            // ძერსკი ციკლი,
            entrySet.getValue().forEach((productItem) -> System.out.println(AnsiColors.ANSI_CYAN+productItem));
            System.out.println();
        }
        System.out.println(AnsiColors.ANSI_RED+"[------------]");


    }
}
