package lesson3.encapsulation;

/**
 * გაკვეთილების კლასი
 */
public class LessonClases {

    private String name;

    private int duration = 3;

    public LessonClases() {
    }

    public LessonClases(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }
}
