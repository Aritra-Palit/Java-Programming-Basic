import java.util.Scanner;

class InsufficientAgeException extends Exception {

    String message;

    public InsufficientAgeException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

class NameException extends Exception {

    String message;

    public NameException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class NameNAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter Your Name:- ");
        name=sc.nextLine();
        char[] z=name.toCharArray();
        try {
        	if (z.length==0) {
            	throw new NameException("Your Name Cannot Be Blank!!!");
            }else if(z[0]==' ') {
            	throw new NameException("Your Name Cannot Be Blank!!!");
            }
            else {
            	System.out.println("Your Name Is "+name+".");
            }
        } catch (NameException e) {
        	e.printStackTrace();
        }
        System.out.print("Enter Your Age:- ");
        int n = sc.nextInt();
        try {
            if (n < 19) {
                throw new InsufficientAgeException("Your Age Does Not Match Our Criteria!!!");
            } else {
                System.out.println("Your Age Matches Our Criteria");
            }
        } catch (InsufficientAgeException mab) {
            mab.printStackTrace();
        }
    }

}