/*
 * The program below is intended to iterate through the words in a list of words (using Scanner), and reverse each
 * word. You will complete the part that reverses each word. For example, if the word is "word", then the result
 * should be "drow", and if the input is "total", then the result should be "latot".
 */

import java.util.Scanner;

public class ReverseSingleWord
{
    public static void main(String[] args)
    {
        String words = "word total quick";
        Scanner in = new Scanner(words);

        int test = 0;

        while (in.hasNext()) {
            test++;
            String word = in.next();

            String reversedWord = "";
           
            for(int i = word.length()-1; i>=0; i-=1){

                reversedWord += word.charAt(i);

            }
                  

            System.out.println("------ Test " + test + " ------");
            System.out.println("OUTPUT:   The reverse of \"" + word + "\" is " + reversedWord);
            if (test == 1)
            {
                System.out.println("EXPECTED: The reverse of \"word\" is drow\n");
            }
            else if (test == 2)
            {
                System.out.println("EXPECTED: The reverse of \"total\" is latot\n");
            }
            else if (test == 3)
            {
                System.out.println("EXPECTED: The reverse of \"quick\" is kciuq\n");
            }
        }
    }
}
