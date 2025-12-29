public class VowelConsonant {
    public static void main(String[] args) {
        String s = "java programming";
        int vowels = 0, consonants = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
