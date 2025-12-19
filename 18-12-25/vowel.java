public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "education";
        int vowels = 0, consonants = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println(vowels + " " + consonants);
    }
}
