package lesson3;

public class EncapsulationExample {

    public static void main(String[] args) {
        Student mike = new Student("Michael", "Jordan");

        System.out.println("ჩვენი სტუდენტია => "+mike.getFirstName()+" "+mike.getLastName());

    }
}
