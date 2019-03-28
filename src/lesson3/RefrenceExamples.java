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
            System.out.println("კი ნამდვილად  Max");
        }
        // შევუცვალოთ ძაღლს სახელი "Rex"
        d.setName("Rex");
    }

    public static void checkNameAndMakeNewInstance(Dog d) {
        if (d.getName().equals("Max")) {
            System.out.println("კი ნამდვილად  Max");
        }

        d.setName("Bobika");


        // ეს არის ლოკალური ცვლადი, რომელსაც მიენიჭა ახალი ობიექტის ინსტანსი,
        // მაგრამ ამ მეთოდს გარეთ ვერ გადის და შიგნით კვდება.
        d = new Dog("Rex");


        System.out.println("ახალი ინსტანსი ობიექტის, რომელიც ლოკალურია:"+d.getName());
    }

    public static void main(String[] args) {
        // ვქმნით ძაღლს სახელად Max
        Dog DOG_MAX = new Dog("Max");

        // ვქმნით ახალ ცვლადს, რომელიც იგივე Max ის Instance-ს მიეკუთვნება
        Dog DOG_REX = DOG_MAX;


        // შევამოწმოთ ძაღლის არსებული სახელი და შევუცვალოთ Rex-დ
        //checkNameAndChange(DOG_REX);

        // მაგალითი ახალი ინსტანსის შექმნა
        checkNameAndMakeNewInstance(DOG_REX);

        System.out.println("საბოლოო სახელია DOG_REX:"+DOG_REX.getName());

        // რა ქვია ძაღლს?
        if (DOG_MAX == DOG_REX) {
            System.out.println("aDog ძაღლის სახელია:" + DOG_MAX.getName());
            System.out.println("oldDog ძაღლის სახელია:" + DOG_REX.getName());
        }
    }
}

