public class Main {
    public static void main(String[] args){
       Generic item = new Generic();
       item.name = "milk";
       item.price = 10;

       System.out.println(item);
       System.out.println(item.getName());
       System.out.println(item.getPrice());
    }
}
