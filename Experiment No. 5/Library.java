import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }
}

class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String toString() {
        return "Member: " + name + " (ID: " + memberId + ")";
    }
}

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void issueBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued: " + book);
                return;
            }
        }
        System.out.println("Book not available");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + book);
                return;
            }
        }
        System.out.println("Invalid return");
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book + (book.isIssued() ? " [Issued]" : " [Available]"));
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "101");
        Book b2 = new Book("1984", "George Orwell", "102");

        Member m1 = new Member("Suyash", 1);

        library.addBook(b1);
        library.addBook(b2);
        library.addMember(m1);

        library.showBooks();
        library.issueBook("101");
        library.showBooks();
        library.returnBook("101");
        library.showBooks();
    }
}