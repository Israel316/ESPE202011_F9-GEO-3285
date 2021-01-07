package evenoroddnumber;
import java.util.Scanner
/**
 *
 *
 */
public class EvenOrOddNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    System.out.println("  please enter an integer--");
    int num = scanner.nextInt();
    if (num%2==0)
    {
        System.out.println("  the number entered is evend--"+num);
    }
    else
    {
        System.out.println( "the number entered is odd--"+num);
    }
            
    