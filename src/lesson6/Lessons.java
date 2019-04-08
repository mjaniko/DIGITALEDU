package lesson6;

public class Lessons {

    private String lessonName;
    private int lessonIndex;

    public Lessons() {
    }

    public Lessons(String lessonName, int lessonIndex) {
        this.lessonName = lessonName;
        this.lessonIndex = lessonIndex;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getLessonIndex() {
        return lessonIndex;
    }
}
