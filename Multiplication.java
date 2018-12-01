      
import java.util.Scanner;


public class Multiplication {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dimension: ");
        int sizeofx = sc.nextInt();
        int sizeofy = sc.nextInt();

int x;
int y;
        int prod;
        for (x = 1; x <= sizeofx; x++) {
            for (y = 1; y <= sizeofy; y++) {
                prod = x * y;
                System.out.printf("%10d", prod);
            }
            System.out.println();
        }
    }
}