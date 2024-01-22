/*
 * You are to complete a program that counts the number of 'a' , 'e', 'i', 'o', 'u' characters
 * that occur in a sentence string
 *
 * For example, if the sentence string is "hello how are you"
 * the output should be:
 * a 1
 * e 2
 * i 0
 * o 3
 * u 1
 *
 */

public class VowelFrequency
{
    public static void main(String[] args)
    {
        String sentence = "the quick brown fox jumps over the lazy dog";
        
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
                
        for (int index = 0; index <= (sentence.length() - 1); index++ ){
 
            switch (sentence.charAt(index)) {
                case 'a':
                    aCount += 1;
                    break;

                case 'e':
                    eCount += 1;
                    break;

                case 'i':
                    iCount += 1;
                    break;

                case 'o':
                    oCount += 1;
                    break;
                
                case 'u':
                uCount += 1;
                break;
  
                default:
                    break;
            }
        }

        System.out.println("------ 'a' Test ------");
        System.out.println("OUTPUT:   a = " + aCount);
        System.out.println("EXPECTED: a = 1");

        System.out.println("\n\n------ 'e' Test ------");
        System.out.println("OUTPUT:   e = " + eCount);
        System.out.println("EXPECTED: e = 3");

        System.out.println("\n\n------ 'i' Test ------");
        System.out.println("OUTPUT:   i = " + iCount);
        System.out.println("EXPECTED: i = 1");

        System.out.println("\n\n------ 'o' Test ------");
        System.out.println("OUTPUT:   o = " + oCount);
        System.out.println("EXPECTED: o = 4");

        System.out.println("\n\n------ 'u' Test ------");
        System.out.println("OUTPUT:   o = " + uCount);
        System.out.println("EXPECTED: o = 2");

    }
}
