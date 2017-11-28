/*
 * Copyright <c> 2017 Manoel Vilela
 */
package books;


/**
 * Handle the book datatype
 * @author lerax
 */
public class Book {
    private String title;
    private int year;
    private String author;

    public Book(String title, int year, String author) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthor(author);
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    
    public void print() {
        System.out.println("== BOOK ==");
        System.out.println("Title:\t" + this.getTitle());
        System.out.println("Year:\t" + this.getYear());
        System.out.println("Author:\t" + this.getAuthor());
    }
    
}
