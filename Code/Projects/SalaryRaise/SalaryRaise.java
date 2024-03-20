import java.util.*;

public class SalaryRaise {
    //Getter method to get salary
    public void increaseSalary(int position, double salary) {
        switch(position) {
            case  1:
            case 2:
                double juniorRaise = salary * 0.05;
                double juniorSalary = salary + juniorRaise;
                System.out.println("Congratulations. Your salary raise is " + juniorRaise);
                System.out.println("Your new salary is " + juniorSalary);
                break;
            case 3:
            case 4:
                double seniorRaise = salary * 0.03;
                double seniorSalary = salary + seniorRaise;
                System.out.println("Congratulations. Your salary raise is " + seniorRaise);
                System.out.println("Your new salary is " + seniorSalary);
                break;
            case 5:
                double execRaise = salary * 0.01;
                double execSalary = salary + execRaise;
                System.out.println("Congratulations. Your salary raise is " + execRaise);
                System.out.println("Your new salary is " + execSalary);
                break;
            default:
                System.out.println("Position unidentified");
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SalaryRaise newRaise = new SalaryRaise();

        //Initialize userSalary and userPosition with no assigments
        double userSalary;
        int userPosition;

        //Positions hashmap to hold position numbers and values.
        HashMap<Integer, String> empPositions = new HashMap<>();
        empPositions.put(1, "Administration Assistant");
        empPositions.put(2, "Junior Software Developer");
        empPositions.put(3, "Senior Software Developer");
        empPositions.put(4, "Project Leader");
        empPositions.put(5, "Executive");

        //Prompt user to enter their current salary
        System.out.println("Enter your salary:");
        userSalary = scnr.nextDouble();

        //Prompt user to enter the number associated with their position
        System.out.println("Enter the number associated with your position:");

        //loop the map and print the position numbers and their associated values
        for (Map.Entry<Integer, String> entry: empPositions.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        // Get the users' position number
        userPosition = scnr.nextInt();
        
        //Call the newRaise object and use the increaseSalary getter method to get user pos and sal
        newRaise.increaseSalary(userPosition, userSalary);
        scnr.close();
    }
}