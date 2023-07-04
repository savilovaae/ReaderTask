public class Main {

    public static void main(String[] args) {
        BirthDate bdIvanov = new BirthDate().setAll(1, 12, 10);
        Reader ivanov = new Reader().setUserFullName("V.V.Ivanov").setFaculty("IT").setReaderTicket(121).
                setPhoneNumber(8981).setUserBDay(bdIvanov);
        Book adventures = new Book().setName("Adventures");
        Book drama = new Book().setName("Drama");
        Book detective = new Book().setName("Detective");
        ivanov.takeBook(drama, detective, adventures);
        ivanov.takeBook("drama", "adventures", "detective");
        ivanov.takeBook(10);
        ivanov.returnBook(4);
        ivanov.returnBook("Drama", "Medicine", "Adventures");
        ivanov.returnBook(drama, detective, adventures);
    }
}
