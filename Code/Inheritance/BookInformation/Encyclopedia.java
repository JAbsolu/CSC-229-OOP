/*
 Given main() and a base Book class, define a derived class called Encyclopedia with member 
 methods to get and set private fields of the following types:

String to store the edition
int to store the number of pages
Within the derived Encyclopedia class, define a printInfo() method that overrides the Book 
class' printInfo() method by printing the title, author, publisher, publication date, 
edition, and number of pages.
 */

 public class Encyclopedia extends Book {
    private String edition;
    private int numPages;
    
    public void setEdition(String val){
        edition = val;
    }

    public void setNumPages(int val){
        numPages = val;
    }

    public String getEdition(){
        return edition;
    }   
    public int getNumPages(){
        return numPages;
    }

    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Pages: " + numPages);
     }
 }