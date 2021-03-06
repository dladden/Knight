
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Scanner scanFile;
        ArrayList<String> wordList = new ArrayList<>();
      
        try {
            scanFile = new Scanner(new File("words.txt"));
            while (scanFile.hasNext()) {
                String word = scanFile.nextLine();
                wordList.add(word);              
            }
            scanFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Exception: "+ex.getMessage());
        }
      
        Scanner scanKeyBoard = new Scanner(System.in);
      
        Random random = new Random();
        String currentWord = wordList.get(random.nextInt(wordList.size()));
        char wordArray[] = new char[currentWord.length()];
        ArrayList<Character> miss = new ArrayList<>();
        ArrayList<Character> guess = new ArrayList<>();
        for(int i=0;i<wordArray.length;i++)
            wordArray[i] = '_';
        //System.out.println("Word: "+currentWord);
      
        int count =0;
        boolean wordFound = false;
        String word = "";
        while(miss.size() < 6 && !wordFound)
        {
            word = "";
            for(int i=0;i<wordArray.length;i++)
                word += String.format("%c ",wordArray[i]);
                  
            System.out.printf("\nWord: %s\n",word);
            System.out.printf("Misses: %s\n",miss);
            System.out.printf("Guesses: %s\n",guess);
            System.out.print("Enter your guess : ");
            String guessString = scanKeyBoard.nextLine();
            if(guessString.length() == 1)
            {
                char currentGuess = guessString.charAt(0);
                boolean found = false;
                for(int i=0;i<currentWord.length();i++)
                {
                    if((currentWord.charAt(i)+"").equalsIgnoreCase(currentGuess+"") && wordArray[i] == '_')
                    {
                        wordArray[i] = currentGuess;
                        guess.add(currentGuess);
                        found = true;
                    }
                }
                if(!found)
                    miss.add(currentGuess);
              
            }
            else
                System.out.println("Enter one char at a time.");
            word = "";
            for(int i=0;i<wordArray.length;i++)
                word += String.format("%c",wordArray[i]);
          
            if(currentWord.equalsIgnoreCase(word))
            {
                wordFound = true;
            }
          
        }
        if(currentWord.equalsIgnoreCase(word))
        {
            System.out.println("Congratulations: You won");
        }
        else
        {
            System.out.println("Whoops: You loss");
        }
    }
}

