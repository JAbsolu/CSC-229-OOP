public class DomainNames {
    public static void main(String[] args) {
        
        String[] letters = {"a","b","c","d","e"};
        String domains[][];
        int dimension = letters.length;
        domains = new String[dimension][dimension];

        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < domains[i].length; j++){
                domains[i][j] = letters[i] + letters[j] + ".com";
            }
        }

        for (String[] arr: domains){
            int counter = 0;
            for (String x: arr) {
                counter += 1;
                System.out.print(x + "\t");
                if (counter == 5) {
                    System.out.print('\n');
                    counter = 0;
                }
            }
        }

    }
}
