import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ()
 * @version ()
 */
public class PartA
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.print("Enter the upperbound: ");
        int upperBound = scanner.nextInt();
        System.out.print("Here is a list of " + size + " random numbers that go from 0-" + upperBound + " ");
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int j = 0; j < size; j++) {
            int i = rand.nextInt(upperBound);
            list.add(i);
        }
        System.out.println(list);
    }
}

//original code written in bluej ↓↓ all I did was use a scanner instead to make it terminal based

//import java.util.Random;
//        import java.util.ArrayList;
///**
// * Write a description of class PartA here.
// *
// * @author ()
// * @version ()
// */
//public class PartA
//{
//    private Random rand;
//
//    /**
//     * Constructor for objects of class PartA
//     */
//    public PartA()
//    {
//        Random rand = new Random();
//    }
//
//    /**
//     * returns an ArrayList containing a given number (int size) of random integers
//     * between 1 and (int upperBound).
//     */
//    public ArrayList randomListOfInts(int size, int upperBound)
//    {
//        Random rand = new Random();
//        ArrayList<Integer> list = new ArrayList<Integer>(size);
//        for(int j = 0; j<size; j++) {
//            int i = rand.nextInt(upperBound);
//            list.add(i);
//        }
//        return list;
//    }
//}
