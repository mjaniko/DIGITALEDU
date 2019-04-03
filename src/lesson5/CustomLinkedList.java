package lesson5;


public class CustomLinkedList<E> {
    E item;
    CustomLinkedList<E> next;
    CustomLinkedList<E> prev;

    public void setItem(E item) {
        this.item = item;
    }

    public void setNext(CustomLinkedList<E> next) {
        this.next = next;
    }

    public CustomLinkedList<E> getNext() {
        return next;
    }
}
