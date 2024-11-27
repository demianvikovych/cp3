public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer("Alice");
        writer.writeBook("Wonderland Adventures");

        Book book = new Book("Wonderland Adventures", "Alice");
        book.openBook();
    }
}
