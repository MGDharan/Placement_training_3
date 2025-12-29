public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "Java is fun";
        s = s.replaceAll("\\s+", "");
        System.out.println(s);
    }
}
