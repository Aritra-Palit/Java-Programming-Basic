import java.util.Scanner;

class UserNameException extends Exception {

    String message;

    public UserNameException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

class PasswordException extends Exception {

    String message;

    public PasswordException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class UserNameNPassword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String CPass="Abcd";
        String name;
        System.out.print("Enter your username:- ");
        name=sc.nextLine();
        char[] z=name.toCharArray();
        try {
        	if (z.length<6) {
            	throw new UserNameException("User Name Invalid!!!");
            }else {
            	System.out.println("User Name Verified.");
            }
        } catch (UserNameException e) {
        	e.printStackTrace();
        }
        System.out.print("Enter Your Pass:- ");
        String n = sc.nextLine();
        try {
            if (n.equals(CPass)!=true) {
                throw new PasswordException("Password Incorrect!!!");
            } else {
                System.out.println("Password Matched!!!");
            }
        } catch (PasswordException mab) {
            mab.printStackTrace();
        }
    }

}