public class Main {
    public static void main(String[] args){
        Produce item_one = new Produce();
        item_one.setName("Milk");
        item_one.setQuantity(8);
        item_one.setExpiration("January 23 2026");
        item_one.printItem();
        System.out.println("Expiration Date: " + item_one.getExpiration());
    }
}
