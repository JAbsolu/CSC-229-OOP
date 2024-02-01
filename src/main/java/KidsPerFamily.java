// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class KidsPerFamily {
  public static void main(String[] args) {
    int kidsInFamily1; // Should be int, not double
    int kidsInFamily2; // (know anyone with 2.3 kids?)
    int numFamilies;
    int avgKidsPerFamily;
    kidsInFamily1 = 3;
    kidsInFamily2 = 4;
    numFamilies = 2;
    avgKidsPerFamily = (kidsInFamily1 + kidsInFamily2) / numFamilies;
    System.out.println("Average kids per family: " + avgKidsPerFamily);
  }
}