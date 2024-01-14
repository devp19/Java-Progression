import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String findName = "Dev";


        Scanner scanner = new Scanner(System.in);
        
        for (int i=1; i<=4; i++) {

            System.out.print("Enter family member number "+i+"'s name: ");
            String personName = scanner.nextLine();

            if(personName.equals(findName)) {
                System.out.println("That's you! Hi, Dev!");
            }

            else {
            System.out.println("Family Member "+i+" name is: "+personName+'!');
            }
        }

        scanner.close();
    }
}
