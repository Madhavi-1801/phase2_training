

package project11;
import java.util.*;

 abstract class LibraryItem {

    String title;
    int itemId;
    boolean isAvailable;

    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    abstract int getLoanPeriod();

    void displayDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
        System.out.println("Loan Period: " + getLoanPeriod() + " days");
    }
}


 interface Borrowable {

    void borrowItem();

    void returnItem();
}




class Book extends LibraryItem implements Borrowable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    public int getLoanPeriod() {
        return 14;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully");
        } else {
            System.out.println(title + " is already borrowed");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned successfully");
    }
}



 class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    public int getLoanPeriod() {
        return 0;
    }
}




 class DVD extends LibraryItem implements Borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    public int getLoanPeriod() {
        return 7;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully");
        } else {
            System.out.println(title + " is already borrowed");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned successfully");
    }
}






 class Librarian {

    ArrayList<LibraryItem> items = new ArrayList<>();

    void addItem(LibraryItem item) {
        items.add(item);
    }

    void displayAllItems() {
        for (LibraryItem item : items) {
            
            item.displayDetails();
        }
    }
}




public class Main {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", 101);
        Magazine magazine = new Magazine("Tech Today", 102);
        DVD dvd = new DVD("Interstellar", 103);

        Librarian librarian = new Librarian();

        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);

        System.out.println("ALL ITEMS");
        librarian.displayAllItems();

        System.out.println("\nBORROW BOOK");
        book.borrowItem();

        System.out.println("\nBORROW DVD");
        dvd.borrowItem();

        System.out.println("\nBORROW MAGAZINE");

        if (magazine instanceof Borrowable) {
            ((Borrowable) magazine).borrowItem();
        } else {
            System.out.println("Magazine cannot be borrowed");
        }

        System.out.println("\nRETURN BOOK");
        book.returnItem();

        System.out.println("\nRETURN DVD");
        dvd.returnItem();
    }
}
