import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,7}$";
        System.out.println(email.matches(regex));
    }
}