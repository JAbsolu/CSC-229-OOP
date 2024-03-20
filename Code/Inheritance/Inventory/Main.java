public class Main {
    public static void main(String[] args){
        Produce item = new Produce();
        System.out.println(item);

        item.setName("Milk");
        item.setExpirationDate("03/04/2025");
        System.out.println(item.print());
    }
}
