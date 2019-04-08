package lesson6;

public class LessonsException extends RuntimeException {

    private String customMessage;

    public LessonsException(String customMessage) {
        super("მოხდა ის რაც არ უნდა მოხდენილიყო");
        this.customMessage = customMessage;
    }

    public String getCustomMessage() {
        return customMessage;
    }
}
