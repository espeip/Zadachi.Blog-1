package blogzadach6;

public class Book {
    private Title title;
    private  Author author;
    private Content content;

    public Book() {
    }

    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    void show() {
        this.title.show();
        this.author.show();
        this.content.show();
    }
    static Book newBook(String title, String author, String content) {
        Book book = new Book(new Title(title), new Author(author), new Content(content));
        return book;
    }
    public static void main(String[] args) {
        Book book1 = newBook("Дюна", "Фрэнг Херберт", "Книга о планете песчаной планете и ее жителях");
        book1.show();
    }
}
class Title {
    private String title;

    public Title() {
    }

    public Title(String title) {
        this.title = title;
    }
    void show() {
        System.out.println("Название книги: " + this.title);
    }
}
class Author {
    private String author;

    public Author() {
    }

    public Author(String author) {
        this.author = author;
    }
    void show() {
        System.out.println("Автор книги: " + this.author);
    }
}
class Content {
    private String content;

    public Content() {
    }

    public Content(String content) {
        this.content = content;
    }
    void show() {
        System.out.println("Содержание книги: " + this.content);
    }
}