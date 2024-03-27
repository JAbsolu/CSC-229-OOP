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