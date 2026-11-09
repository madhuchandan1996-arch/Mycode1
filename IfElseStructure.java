package Basic_Programs2;

public class IfElseStructure {
    public static void main(String[] args) {

        int num = 25;

        if (num > 50) {   // Main IF block

            if (num > 60) {
                System.out.println("Number is greater than 60");
            }

            if (num > 70) {
                System.out.println("Number is greater than 70");
            }
        }

        
        else if (num > 20) // ELSE IF block
          {
        	if (num > 30) {
                System.out.println("Number is greater than 30");
            }
            else if (num > 25) {
                System.out.println("Number is greater than 25");
            }
            else {
                System.out.println("Number is between 21 and 25");
            }
        }

        
        else {  // LAST ELSE block

            if (num > 10) {
                System.out.println("Number is between 11 and 20");
            }
            else {
                System.out.println("Number is 10 or less");
            }
        }
    }
}

