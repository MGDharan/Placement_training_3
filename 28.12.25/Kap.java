public class Kaprekar {
    public static void main(String[] args) {
        int n = 45;
        int sq = n * n;
        String s = String.valueOf(sq);

        String left = s.substring(0, s.length() / 2);
        String right = s.substring(s.length() / 2);

        int l = left.isEmpty() ? 0 : Integer.parseInt(left);
        int r = Integer.parseInt(right);

        System.out.println(l + r == n ? "Kaprekar" : "Not Kaprekar");
    }
}
