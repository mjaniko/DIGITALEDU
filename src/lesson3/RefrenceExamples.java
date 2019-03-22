package lesson3;

/**
 * Java is always pass-by-value.
 * When we pass the value of an object, we are passing the reference to it
 * https://stackoverflow.com/questions/9404625/java-pass-by-reference/9404727#9404727
 */
public class RefrenceExamples {

    static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void checkNameAndChange(Dog d) {
        if (d.getName().equals("Max")) {
            System.out.println("ძაღლის სახელია Max");
        }
        // შევუცვალოთ ძაღლს სახელი "Rex"
        d.setName("Rex");
    }

    public static void checkNameAndMakeNewInstance(Dog d) {
        if (d.getName().equals("Max")) {
            System.out.println("ძაღლის სახელია Max");
        }

        // ვქმნით სრულიად დამოუკიდებელ ძაღლს. d points now to a new Dog Instance "Rex"
        d = new Dog("Rex");

        System.out.println("რა ქვია ძაღლს?:" + d.getName());
    }

    public static void main(String[] args) {
        // ვქმნით ძაღლს სახელად Max
        Dog aDog = new Dog("Max");

        // ვქმნით ახალ ცვლადს, რომელიც იგივე Max ის Instance-ს მიეკუთვნება
        Dog oldDog = aDog;

        // შევამოწმოთ ძაღლის არსებული სახელი და შევუცვალოთ Rex-დ
        //checkNameAndChange(aDog);

        // მაგალითი ახალი ინსტანსის შექმნა
        //checkNameAndMakeNewInstance(aDog);

        // რა ქვია ძაღლს?
        if (aDog == oldDog) {
            System.out.println("aDog ძაღლის სახელია:" + aDog.getName());
            System.out.println("oldDog ძაღლის სახელია:" + oldDog.getName());
        }
    }
}

