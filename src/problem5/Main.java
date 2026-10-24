package problem5;

public class Main {
    public static void main(String[] args) {
        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b1984 = new Book("1984", "George Orwell", 1949);
        Book clean = new Book("Clean Code", "Robert C. Martin", 2008);

        // ---------- Stack (LIFO) ----------
        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();
        stack.push(hobbit);
        stack.push(b1984);
        stack.push(clean);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        stack.display();

        // ---------- Queue (FIFO) ----------
        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();
        queue.enqueue(hobbit);
        queue.enqueue(b1984);
        queue.enqueue(clean);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());
        queue.display();
    }
}
