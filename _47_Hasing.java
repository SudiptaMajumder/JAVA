/* HashSet in Java
 */

import java.util.*;

public class _47_Hasing {

  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(4);
    set.add(2);
    set.add(5);
    set.add(4);
    // HashSet always Hold Unique Value.
    System.out.println(set);
    //Size
    System.out.println("Size of Set is: " + set.size());

    //Search
    if (set.contains(2)) {
      System.out.println("present");
    }
    if (!set.contains(6)) {
      System.out.println("absent");
    }

    //Delete
    set.remove(4);
    if (!set.contains(4)) {
      System.out.println("absent");
    }

    //Print all elements
    System.out.println(set);

    //Iteration - HashSet does not have an order
    set.add(9);
    set.add(11);
    Iterator it = set.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }
    System.out.println();

    //isEmpty
    if (!set.isEmpty()) {
      System.out.println("set is not empty");
    }
  }
}
