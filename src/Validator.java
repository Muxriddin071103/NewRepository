
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter phone number for validate: ");
        String phNum = scanner.nextLine();
        System.out.println(validatePhoneNumber(phNum));

        System.out.print("Enter email for validate: ");
        String email = scanner.nextLine();
        System.out.println(validateEmail(email));

        System.out.print("Enter password for validate: ");
        String pass = scanner.nextLine();
        System.out.println(validatePassword(pass));

        System.out.print("Enter text for splitting: ");
        String textSplit = scanner.nextLine();
        System.out.println(splitTextIntoWords(textSplit));

        System.out.print("Enter text where counting numbers: ");
        String textWithNums = scanner.nextLine();
        System.out.println(countNums(textWithNums));
    }

    public static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches("^\\+(?:[0-9] ?){6,14}[0-9]$");
    }

    public static boolean validateEmail(String email){
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean validatePassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}$");
    }

    public static Set<String> splitTextIntoWords(String text){
        return new HashSet<>(Arrays.asList(text.split("\\s+")));
    }

    public static int countNums(String text){
        Matcher matcher = Pattern.compile("\\d+").matcher(text);
        int c=0;
        while (matcher.find()){
            c++;
        }
        return c;
    }
}
