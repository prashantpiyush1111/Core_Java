
import java.util.HashMap;

public class Isomorphic{
    // Isomorphic check karne ka function
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }
            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }
            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    // VS Code me run karne ke liye Main function
    public static void main(String[] args) {
        Isomorphic solution = new Isomorphic();

        // Test Cases
        String s1 = "egg", t1 = "add";
        String s2 = "foo", t2 = "bar";
        String s3 = "paper", t3 = "title";

        System.out.println("Test Case 1 (" + s1 + ", " + t1 + "): " + solution.isIsomorphic(s1, t1)); // True
        System.out.println("Test Case 2 (" + s2 + ", " + t2 + "): " + solution.isIsomorphic(s2, t2)); // False
        System.out.println("Test Case 3 (" + s3 + ", " + t3 + "): " + solution.isIsomorphic(s3, t3)); // True
    }
}
