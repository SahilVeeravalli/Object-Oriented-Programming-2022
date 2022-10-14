/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refPages;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages, String refPages,
    int borrowed, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 10;
        refPages = "";
        borrowed = 0;
        courseText = false;

        
    }
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    public int getPages()
    {
        return pages;
    }
    public void printDetails()
    {
        System.out.println("Title:" + title + "," + "Author" + author + "," 
        + "Pages" + pages + "This book has been borrowed" + borrowed + "times");
        
        if (refPages == "")
            System.out.println("Reference Number: ZZZ");
        else
            System.out.println("Reference Number:" + refPages);
        
    }
    public void setRefNumber(String ref)
    {
        if (ref.length() > 0)
            refPages = ref;
        else
            refPages = "MUST BE AT LEAST 3 CHARACTERS";
    }
    public String getRefNumber()
    {
        return refPages;
    }
    public void borrow()
    {
        borrowed += 1;
    }
    public int getBorrow()
    {
        return borrowed;
    }
    public boolean isCourseText()
    {
        return courseText;
    }
}
