package Book;

public class TestAuthor {

    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Assis", "Assis@gmail.com", 'm');
        authors[1] = new Author("Moraes", "Moraes@gmail.com", 'm');

        Book book = new Book("Java Programming", authors, 59.99);
        System.out.println("Authors: " + book.getAuthorNames());
        System.out.println(book);
    }

}
