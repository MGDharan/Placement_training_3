public class CaseCount {
    public static void main(String[] args) {
        String s = "JavaPROGRAM";

        int upper = 0, lower = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
