package bookshelf.books;
import bookshelf.books.Author;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author();
        author1.name = "John";
        author1.surname = "Thompson";
        author2.name = "Tom";
        author2.surname = "Crowed";
        System.out.println(author2);
        System.out.println(author1);
        char ch1 = 88;
        System.out.println(ch1);
    }
        
}
