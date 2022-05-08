import java.util.Scanner;

class MultithreadingDemo extends Thread {
    void thread1() {
        int i;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st line of text");
        str = sc.nextLine();
        System.out.println("splitting string using split() method");
        String tk[] = str.split(" ");

        for(i=0;i<tk.length;i++)
            System.out.println(tk[i]);

        System.out.println("\n");
    }

    void thread2() {
        int i;
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2nd line of text");
        str1 = sc.nextLine();
        String tk1[] = str1.split(" ");
        for (i = 0; i < tk1.length; i++) {
            System.out.println(tk1[i]);
        }
    }

    public void run() {
        thread1();
        thread2();
    }
}

public class Multithreading {
    public static void main(String args[]) {
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }
}