public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] words = s.split(" ");

        for (String w : words) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
    }
}
