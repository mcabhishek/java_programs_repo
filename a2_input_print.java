import java.util.Scanner;
public class a2_input_print {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("hello " + name);
    }
}
