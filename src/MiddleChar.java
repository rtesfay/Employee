import java.util.Scanner;

public class MiddleChar {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String word;
        System.out.println("Enter an odd n value of length of a text");
        int n;
        n= keyboard.nextInt();
        word= keyboard.next();
        System.out.println(word.charAt(word.length()/2));

    }
}
