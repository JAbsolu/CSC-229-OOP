import java.util.Date;

public class Produce extends Generic {
    private String expirationDate;

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return new Date();
    }

    public void print() {
        System.out.println("Expiration date: " + getExpirationDate());
    }
}
