public class Automorphic {
    public static void main(String[] args) {
        int n = 25;
        int sq = n * n;

        System.out.println(String.valueOf(sq).endsWith(String.valueOf(n))
                ? "Automorphic" : "Not Automorphic");
    }
}
