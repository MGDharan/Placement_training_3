public class DuckNumber {
    public static void main(String[] args) {
        String n = "1023";
        System.out.println(n.contains("0") && n.charAt(0) != '0'
                ? "Duck Number" : "Not Duck");
    }
}
