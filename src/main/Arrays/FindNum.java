import java.util.Scanner;

public class FindNum {

    public int returnNum(int[] nums, int input) {
        int index; 
        for (int i =0; i < nums.length; ++i){
            if (nums[i] == input) {
                index = i;
                return index;
            }
        }
        return index = -1;
    }
    public static main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input;
        FindNum newSearch = new FindNum();

        System.out.println("Enter a num: ");

        input = scnr.nextInt();

        int[] nums = {1,2,3,4,5,6,7};
        newSearch(nums, input);
    }
}
