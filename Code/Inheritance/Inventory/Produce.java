public class Produce extends Generic { 
    private String expirationDate;
 
    public void setExpiration(String newDate) {
       expirationDate = newDate;
    }
 
    public String getExpiration() {
       return expirationDate;
    }  
}