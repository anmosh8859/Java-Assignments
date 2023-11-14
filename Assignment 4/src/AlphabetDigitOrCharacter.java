import java.util.Scanner;
public class AlphabetDigitOrCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char symbol =sc.next().charAt(0);
        if((symbol<=(char)91&&symbol>=(char)65)||(symbol<=(char)122&&symbol>=(char)97)) System.out.println("Enter character is alphabet");
        else if ((symbol<=(char)57&&symbol>=(char)48)) System.out.println("Entered Character is Digit");
        else System.out.println("Entered character is other than alphabet or digit.");
    }
}
