import java.util.Random;
import java.util.Scanner;

public class Application {

   private static final String[] WORDS = { "Awkward", "Bagpipes", "Croquet", "Crypt", "Dwarves", "Gazebo", "Gypsy",
           "Haphazard", "Hyphen", "Ivory", "Jazzy", "Jiffy", "Jinx", "Jukebox", "Kayak", "Kiosk", "Memento", "Oxygen",
           "Sphinx", "Zealous" };

   /**
   * Displays the word with blanks to the user
   */
   static void printWord(StringBuilder word) {
       for (int i = 0; i < word.length(); i++)
           System.out.print(word.charAt(i) + " ");
   }
  
   public static void main(String[] args) {

       // Scanner to get user input
       Scanner in = new Scanner(System.in);
      
       // Random to generate a random index
       Random r = new Random();
      
       int wins = 0;
       int losses = 0;
       int prevIndex = -1;
      
       // Start game
       String choice = "";
       do {
           // Get a random word
           int index = -1;
           do {
               index = r.nextInt(WORDS.length);
           } while (index == prevIndex);
           String currWord = WORDS[index].toUpperCase();
          
           // String for displaying to the user
           // Set as (currWord.length) no. of blanks
           StringBuilder displayWord = new StringBuilder(currWord.replaceAll("[A-Z]", "_"));

           // Number of guesses left
           int noOfGuesses = 6;
          
           do {
               // Display guesses left and ask for user input
               System.out.println("You have " + noOfGuesses + " incorrect guesses left.");
               printWord(displayWord);
               System.out.print("\nWhat is you guess? ");
               char ch = in.next().toUpperCase().charAt(0);
              
               // Check if ch is present in currWord
               if (currWord.indexOf(ch) != -1) {
                   // Check if the letter is already entered
                   if (displayWord.indexOf(ch + "") == -1) {
                  
                       // Replace blank at index in displayWord with ch, where ch is present in currWord
                       int pos = -1;
                       while ((pos = currWord.indexOf(ch, pos + 1)) != -1) {
                           displayWord.setCharAt(pos, ch);
                       }
                   }
               } else // Decrement no. of guesses
                   noOfGuesses -= 1;
              
               System.out.println();
           } while ((noOfGuesses > 0) && !currWord.equalsIgnoreCase(displayWord.toString()));
          
           // Keep score
           if (currWord.equalsIgnoreCase(displayWord.toString())) {
               wins += 1;
               System.out.println(displayWord);
               System.out.println("You win.");
           } else {
               losses += 1;
               System.out.println("You lose.");
           }
          
           // Ask whether user wants to continue
           do {
               System.out.print("Do yo want to play again[Y/N]: ");
               choice = in.next();
           } while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N"));
          
           // Display no. of wins and losses
           System.out.println("\nNo. of wins: " + wins);
           System.out.println("No. of losses: " + losses + "\n");
          
           prevIndex = index;
       } while (choice.equalsIgnoreCase("Y"));
      
       // Close scanner
       in.close();
   }
}