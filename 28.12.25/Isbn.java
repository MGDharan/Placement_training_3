public class ISBN {
    public static void main(String[] args) {
        String isbn = "0306406152";
        int sum = 0;

        for (int i = 0; i < 10; i++)
            sum += (isbn.charAt(i) - '0') * (10 - i);

        System.out.println(sum % 11 == 0 ? "Valid ISBN" : "Invalid ISBN");
    }
}
