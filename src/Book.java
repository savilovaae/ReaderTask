public class Book {
    String name;

    public Book() {
        this.name = "Unknown name";
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }
}
