/* 
HashMap in Java
 */

import java.util.*;

public class _48_hashMap {

  public static void main(String[] args) {
    //Creation
    HashMap<String, Integer> map = new HashMap<>();

    //Insertion
    map.put("India", 120);
    map.put("USA", 30);
    map.put("China", 150);
    System.out.println(map);

    map.put("China", 80);
    System.out.println(map);

    //Searching
    if (map.containsKey("Indonisa")) {
      System.out.println("Key is Present in the map");
    } else {
      System.out.println("Key is not present in the map");
    }

    System.out.println(map.get("China")); //key exists
    System.out.println(map.get("Indonesia")); //key doesn't exist
    System.out.println();

    //Iteration -1
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      System.out.println(e.getKey() + " " + e.getValue());
    }
    System.out.println();

    //Iteration - 2
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key + " " + map.get(key));
    }
    System.out.println();

    //Removing
    map.remove("China");
    System.out.println(map);
  }
}
