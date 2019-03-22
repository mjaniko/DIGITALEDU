package lesson3;

public class Car {

    public String model;

    public String manufacturer;

    public String manufactureDay = "MONDAY";

    public Car(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void getWeekDay(){
        System.out.println("მანქანა "+ manufacturer +" " + model);
    }


}
