package lesson8.model;

/**
 * მენიუს კატეგორიები
 */
public class Category {
    private String title = "";

    public Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
