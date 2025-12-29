public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1010;
        int decimal = 0, base = 1;

        while (binary > 0) {
            decimal += (binary % 10) * base;
            base *= 2;
            binary /= 10;
        }
        System.out.println(decimal);
    }
}
