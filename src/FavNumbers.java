import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fav1 = 0;
        int fav2 = 0;
        int fav3 = 0;

        fav1 = SafeInput.getInt(in, "Enter your first favorite number");
        fav2 = SafeInput.getInt(in, "Enter your second favorite number");
        fav3 = SafeInput.getInt(in, "Enter your third favorite number");

        System.out.println("Your favorite numbers are: " + fav1 + ", " + fav2 + ", and " + fav3);
    }
}
