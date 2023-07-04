public class Book {
    String name;

    public Book() {
        this.name = "Unknown genre";
    }

    public Book setGenre(String name) {
        this.name = name;
        return this;
    }
}
