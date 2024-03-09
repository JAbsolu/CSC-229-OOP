public class Arrays {
    public static void main(String[] args){
        int [][] drivingDistances = new int[3][3];

        drivingDistances[0][0] = 0;
        drivingDistances[0][1] = 960;
        drivingDistances[0][2] = 2960;
        drivingDistances[1][0] = 435;
        drivingDistances[1][1] = 567;
        drivingDistances[1][2] = 9787;
        drivingDistances[2][0] = 878;
        drivingDistances[2][1] = 810;
        drivingDistances[2][1] = 810;
        
        for (int[] arr: drivingDistances) {
            for (int x: arr) {
                x = 1;
                System.out.println(x);
            }
        }

        System.out.println("\n");
        for (int[] arr: drivingDistances) {
            for (int val: arr) {
                String tempVal = "----- TEMP VAL = ";
                System.out.println("New Temp Val " + tempVal + val + "\n");
                val -= val;
                System.out.println("Second Loop " + val);
            }
        }

        System.out.println(drivingDistances);
    }   
}
