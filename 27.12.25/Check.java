public class Disarium {
    public static void main(String[] args) {
        int n = 135, sum = 0, temp = n;
        int len = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, len--);
            temp /= 10;
        }
        System.out.println(sum == n ? "Disarium" : "Not Disarium");
    }
}
