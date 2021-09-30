import java.util.Scanner;

public class Characters {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String text;
        System.out.println("Enter a text");
        text=keyboard.nextLine();

        System.out.print(text.length());
        System.out.print(text.charAt(0));
        System.out.print(text.charAt(text.length()-1));



    }
}
