import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the base of the triangle: ");
    int num = in.nextInt();
    for (int i = num; i > 0; i--) {
        String line = "";
        for (int j = i; j > 0; j--) {
            line += "*";  
        }
        System.out.println(line);
    
  }
}
