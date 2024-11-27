public class Writer {
    private String name;
    private Book book; 

    
    public Writer(String name) {
        this.name = name;
    }

    
    public void writeBook(String bookName) {
        this.book = new Book(bookName, this.name);
        System.out.println(name + " wrote a book called " + book.getName());
    }
}
