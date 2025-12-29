public class StringToInt {
    public static void main(String[] args) {
        String s = "123";
        int num = 0;

        for (char c : s.toCharArray()) {
            num = num * 10 + (c - '0');
        }
        System.out.println(num);
    }
}
