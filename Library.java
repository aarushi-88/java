import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private String gender;

    // Default constructor
    public Author() {
    }

    // Parameterized constructor
    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Email: " + email
                + ", Gender: " + gender;
    }
}


class Book {
    private String title;
    private double price;
    private Author author;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // toString() prints Author details
    @Override
    public String toString() {
        return "Book Title: " + title
                + "\nPrice: " + price
                + "\nAuthor: " + author;
    }
}


public class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Author details
        System.out.println("Enter Author details (name,email,gender)");
        String authorInput = sc.nextLine();

        String[] authorData = authorInput.split(",");

        String authorName = authorData[0].trim();
        String email = authorData[1].trim();
        String gender = authorData[2].trim();

        Author author = new Author(
                authorName,
                email,
                gender
        );

        // Read Book details
        System.out.println("Enter Book details (title,price)");
        String bookInput = sc.nextLine();

        String[] bookData = bookInput.split(",");

        String title = bookData[0].trim();
        double price = Double.parseDouble(bookData[1].trim());

        // Pass Author object to Book
        Book book = new Book(title, price, author);

        // Display book details
        System.out.println("\n" + book);

        sc.close();
    }
}