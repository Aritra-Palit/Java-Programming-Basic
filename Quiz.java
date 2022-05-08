import java.util.Scanner;

class WrongAnswerException extends Exception {

    String message;

    public WrongAnswerException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class Quiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answera, answerb, answerc, canswera, canswerb, canswerc;
        canswera="General Manoj Mukund Narvane";
        canswerb="Admiral Karambir Singh";
        canswerc="Air Chief Marshal Vivek Ram Chaudhari";
        System.out.print("Who is the current Chief of The Army Staff? ");
        answera=sc.nextLine();
        System.out.print("Who is the current Chief of The Navy Staff? ");
        answerb=sc.nextLine();
        System.out.print("Who is the current Chief of The Air Staff? ");
        answerc=sc.nextLine();
        try {
        	if (answera.equals(canswera)!=true) {
        		throw new WrongAnswerException("Wrong Answer!!! The Current Chief of the Army Staff is General Manoj Mukund Narvane.");
            }else if (answerb.equals(canswerb)!=true) {
        		throw new WrongAnswerException("Wrong Answer!!! The Current Chief of the Navy Staff is Admiral Karambir Singh.");
            }else if (answerc.equals(canswerc)!=true) {
        		throw new WrongAnswerException("Wrong Answer!!! The Current Chief of the Air Staff is Air Chief Marshal Vivek Ram Chaudhari.");
            }
        	else {
            	System.out.println("Good! The answers are correct.");
            }
        } catch (WrongAnswerException e) {
        	e.printStackTrace();
        }
    }
}