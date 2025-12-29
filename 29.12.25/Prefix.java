public class LongestPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }
}
