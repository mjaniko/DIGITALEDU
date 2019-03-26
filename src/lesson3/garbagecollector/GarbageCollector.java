package lesson3.garbagecollector;

public class GarbageCollector {

    public static void main(String[] args) {

        printer();

        System.gc();




    }

    public static void printer(){
        int number = 1;
        System.out.println("ციფრი: "+number);
    }
}
