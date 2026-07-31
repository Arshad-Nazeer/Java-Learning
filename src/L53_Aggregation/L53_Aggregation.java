package L53_Aggregation;

public class L53_Aggregation {
    public  static void main(String[] args) {
        // Aggregation
        // Represents a "has-a" relationship between objects
        // One object contains another object as part of its structure but the contained object/s can exist independently

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return Of The King", 416);

        Book[] books = {book1,book2,book3};

        System.out.println(book1.displayInfo());

        for(Book book: books) System.out.println(book.displayInfo());

        // Library "has" a lot of Book objects
        // Library Object aggregates a lot of Book objects
        // deleting library won't delete books
        // The child object is usually created outside and then passed into the parent.
        // Parent uses the child but doesn't own its existence.
        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}
