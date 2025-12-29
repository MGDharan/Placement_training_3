public class CircularRotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        System.out.println((s1 + s1).contains(s2)
                ? "Rotation" : "Not Rotation");
    }
}
