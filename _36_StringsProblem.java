public class _36_StringsProblem {
    public static void main(String[] args) {
        String firstName = "Tony";
        String secondName = "Stark";
        String fullName = firstName + " " + secondName;

        // Access characters of a string
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // Compare 2 strings
        String name1 = "Tony";
        String name2 = "Tony";
        if (name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
        
        // DO NOT USE == to check for string equality
        // Gives correct answer here
        if (name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
        // Gives incorrect answer here
        if (new String("S") == new String("S")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // Substring - The substring of a string is a subpart of it.
        String name_Sub = "TonyStark";
        System.out.println(name_Sub.substring(0, 4));
        System.out.println(name_Sub.substring(5, 8));
        System.out.println(name_Sub.substring(5));

        //ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

    }
}