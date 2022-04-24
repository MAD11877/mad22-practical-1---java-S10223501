import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt();
    List<Integer> numList = new ArrayList<Integer>();
    for (int i = 0; i < num; i++) {
        System.out.println("Enter a number again: ");
        int no = in.nextInt();
        numList.add(no);
    }

    for (int i = 0; i < numList.size(); i++) {
        int count = 0;
        for (int j = 0; j < numList.size(); j++) {
            if (numList.get(i) == numList.get(j)) {
                count++;
            }
        }
    }

    Integer mostOccurred = numList.stream()
            .reduce(
                    BinaryOperator.maxBy(
                            (o1, o2) -> Collections.frequency(numList, o1) - Collections.frequency(numList, o2)))
            .orElse(null);
    System.out.println(mostOccurred + " has the highest occurence");
    
  }
}
