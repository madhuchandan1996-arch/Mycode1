package Basic_Programs2;

public class NestedIfExample {
    public static void main(String[] args) {

        int number = 15;

        if (number > 50) {
            System.out.println("Number is greater than 50");
        } 
        else {
            if (number > 40) {
                System.out.println("Number is between 41 and 50");
            }
            if (number > 20) {
                System.out.println("Number is between 21 and 40");
            }
            if (number > 10) {
                System.out.println("Number is between 11 and 20");
            }
        }
    }
}

