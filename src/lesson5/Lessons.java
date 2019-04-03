package lesson5;

public class Lessons<T> {

    private T name;


    public Lessons(T name) {
        this.name = name;
    }

    public void print(){
        if(this.name instanceof String){
            System.out.println("ეს მონაცემი არის ტექსტის ტიპის და მნიშვნელობა:"+this.name);
        }
        else if(this.name instanceof Integer){
            System.out.println("ეს მონაცემი არის რიცხვთა ტიპის და მნიშვნელობა:"+this.name);
        }
        else if(this.name instanceof Boolean){
            System.out.println("ეს მონაცემი არის ბოოლ ტიპის და მნიშვნელობა:"+this.name);
        }
    }


    public T getName() {
        return name;
    }


    public static void main(String[] args) {
        Lessons<String> lessons = new Lessons<>("NAME");
        lessons.print();

        Lessons<Integer> integerScope = new Lessons<>(1);
        integerScope.print();

        Lessons<Boolean> booleanLessons = new Lessons<>(false);
        booleanLessons.print();
    }
}
