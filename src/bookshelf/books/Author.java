package bookshelf.books;

public class Author {
    public String name;
    public String surname;

    public void printFullName(){
        System.out.println(name + " " + surname);
    }
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
