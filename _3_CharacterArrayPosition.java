
/* Write a function that accepts a character array, a zero-based start position and a length. It should
return a character array containing containing length characters starting with the start character of the
input array. The function should do error checking on the start position and the length and return null if the
either value is not legal.

The function signature is:
char[ ] f(char[ ] a, int start, int len)

Examples
if input parameters are    return
{'a', 'b', 'c'}, 0, 4      null
{'a', 'b', 'c'}, 0, 3      {'a', 'b', 'c'}
{'a', 'b', 'c'}, 0, 2       {'a', 'b'}
{'a', 'b', 'c'}, 0, 1       {'a'}
{'a', 'b', 'c'}, 1, 3       null
{'a', 'b', 'c'}, 1, 2       {'b', 'c'}
{'a', 'b', 'c'}, 1, 1       {'b'}
{'a', 'b', 'c'}, 2, 2       null
{'a', 'b', 'c'}, 2, 1       {'c'}
{'a', 'b', 'c'}, 3, 1       null
{'a', 'b', 'c'}, 1, 0       {}
{'a', 'b', 'c'}, -1, 2      null
{'a', 'b', 'c'}, -1, -2     null
{}, 0, 1                    null
 */


public class _3_CharacterArrayPosition {

    static char[] f(char[] a, int start, int length) {
        if (a == null || length < 0 || start < 0 || start >= a.length || (start + length) > a.length) {
            return null;
        }

        char[] newarray = new char[length];

        for (int i = start, j = 0; j < length; i++, j++) {
            newarray[j] = a[i];
        }
        return newarray;
    }

    public static void main(String[] args) {
        printArray(f(new char[]{'a', 'b', 'c'}, 0, 4));
        printArray(f(new char[]{'a', 'b', 'c'}, 0, 3));
        printArray(f(new char[]{'a', 'b', 'c'}, 0, 2));
        printArray(f(new char[]{'a', 'b', 'c'}, 0, 1));
        printArray(f(new char[]{'a', 'b', 'c'}, 1, 3));
        printArray(f(new char[]{'a', 'b', 'c'}, 1, 2));
        printArray(f(new char[]{'a', 'b', 'c'}, 1, 1));
        printArray(f(new char[]{'a', 'b', 'c'}, 2, 2));
        printArray(f(new char[]{'a', 'b', 'c'}, 2, 1));
        printArray(f(new char[]{'a', 'b', 'c'}, 3, 1));
        printArray(f(new char[]{'a', 'b', 'c'}, 1, 0));
        printArray(f(new char[]{'a', 'b', 'c'}, -1, 2));
        printArray(f(new char[]{'a', 'b', 'c'}, -1, -2));
        printArray(f(new char[]{}, 0, 1));
    }
    

    static void printArray(char[] arr) {
        if (arr == null) {
            System.out.println("null");
        } else {
            System.out.print("{ ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("'" + arr[i] + "'");
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");
        }
    }
    
}
