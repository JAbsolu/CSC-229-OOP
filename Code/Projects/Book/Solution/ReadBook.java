import java.util.Scanner;
import java.util.ArrayList;

public class ReadBook {  
    /* Find word in book method */
    public void findWord(String[][] arr, String word) {
        /* The array below will hold the chapters the word is found in */
        ArrayList <String> chapters = new ArrayList<>();
        int i;
        int j;

        for (i = 0; i < arr.length; ++i){
            String[] innerArr = arr[i];
            for (j = 0; j < innerArr.length; ++j) {
                /* Convert userinput and chapters into lowercase to make sure strings always match */
                word = word.toLowerCase();
                String innerArrWords = innerArr[j].toLowerCase();
                //Check if the word is in the chapter
                if (innerArrWords.contains(word) && j == 1){
                    String chapter = innerArr[0];
                    chapters.add(chapter);
                }
            }
        }

        /* The block of code below has an if an else statement that checks if the word is in the chapter or not */
        String wordFound = "The word " + word + " was found in the following chapters: \n";

        if (chapters.size() > 0) {
            for (String chap : chapters) {
                wordFound += chap + "\n";
            }
            System.out.println(wordFound);
        } else {
            System.out.println("The word " + word + " Was not found.");
        }
    }   

    /* Main method */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        
        /* Prompt user to search for word */
        System.out.print("Enter a word to search for: ");
        userInput = scnr.nextLine();

        String[][] book = { 
            { "Chapter 1", "In an electronically controlled switch, a positive voltage at the control input allows electricity to flow, while a zero voltage prevents the flow. Such switches were useful, for example, in routing telephone calls." },
            { "Chapter 2", "When a statement that assigns a variable with a value executes, the processor writes the value into the variable's memory location. Likewise, reading a variable's value reads the value from the variable's memory location." },
            { "Chapter 3", "A type conversion is a conversion of one data type to another, such as an int to a double. The compiler automatically performs several common conversions between int and double types, such automatic conversions are known as implicit conversion." },
            { "Chapter 4", "An expression involving the equality or inequality operators evaluates to a Boolean value. A Boolean is a type that has just two values: true or false." },
            { "Chapter 5", "A for loop is a loop with three parts at the top: a loop variable initialization, a loop expression, and a loop variable update. A for loop describes iterating a specific number of times more naturally than a while loop." },
            { "Chapter 6", "Iterating through an array for various purposes is an important programming skill to master. The program below computes the sum of an array's element values. For computing the sum, the program initializes a variable sum to 0, then simply adds the current iteration's array element value to that sum." },
        };

        ReadBook newBook = new ReadBook();
        newBook.findWord(book, userInput);
    }
}