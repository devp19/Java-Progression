/*
 * The program below is intended to iterate through the words in a list of words (using Scanner), and identify which
 * contain more than one vowel in a row. You should complete the handling of each word, by setting the boolean
 * variable hasConsVowels to true or false as needed.
 *
 * For example,
 * if the word = "field" then hasConsVowels should be true
 *             = "throw" then hasConsVowels should be false
 */

import java.util.Scanner;

public class ConsecutiveVowels
{
    public static void main(String[] args)
    {
        String words = "field quick abdicate mood about cattle";
        Scanner in = new Scanner(words);

        int test = 0;

        while (in.hasNext()) {
            test++;
            String word = in.next();
            boolean hasConsVowels = false;

            boolean currentVowel = false;
            boolean previousVowel = false;

            for(int index = 0; index <= word.length()-1; index++)
            {

                switch (word.charAt(index)) {
                    case 'a':
                        currentVowel = true;
                        break;
                    case 'e':
                        currentVowel = true;
                        break;
                    case 'i':
                        currentVowel = true;
                        break;
                    case 'o':
                        currentVowel = true;
                        break;
                    case 'u':
                        currentVowel = true;
                        break;
                
                    default:
                        currentVowel = false;
                        break;
                }

                if (previousVowel == true && currentVowel == true){
                    hasConsVowels = true;
                    break;
                }

                previousVowel = currentVowel;

            }
        
            System.out.println("------ Test " + test + " ------");
            if (hasConsVowels)
            {
                System.out.println("OUTPUT:   " + word + " has consecutive vowels");
            }
            else
            {
                System.out.println("OUTPUT:   " + word + " does not have consecutive vowels");
            }

            if (test == 1)
            {
                System.out.println("EXPECTED: field has consecutive vowels\n");
            }
            else if (test == 2)
            {
                System.out.println("EXPECTED: quick has consecutive vowels\n");
            }
            else if (test == 3)
            {
                System.out.println("EXPECTED: abdicate does not have consecutive vowels\n");
            }
            else if (test == 4)
            {
                System.out.println("EXPECTED: mood has consecutive vowels\n");
            }
            else if (test == 5)
            {
                System.out.println("EXPECTED: about has consecutive vowels\n");
            }
            else if (test == 6)
            {
                System.out.println("EXPECTED: cattle does not have consecutive vowels\n");
            }
        }
    }
}
