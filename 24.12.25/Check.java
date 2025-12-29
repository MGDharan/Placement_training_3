public class Pangram {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        boolean[] present = new boolean[26];

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                present[c - 'a'] = true;
        }

        for (boolean b : present) {
            if (!b) {
                System.out.println("Not Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
