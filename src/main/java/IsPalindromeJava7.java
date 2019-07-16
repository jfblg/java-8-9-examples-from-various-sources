public class IsPalindromeJava7 {
    public static void main(String[] args) {
        String word1 = "abba";
        System.out.println(isPalindrome(word1));
        System.out.println(isPalindromeFunctional(word1));

    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                sb.append(c);
        }
        String forward = sb.toString().toLowerCase();
        String reverse = sb.reverse().toString().toLowerCase();
        return forward.equals(reverse);
    }

    public static boolean isPalindromeFunctional(String s) {
        // codePoints returns IntStream
        String forward = s.toLowerCase().codePoints()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        String reverse = new StringBuilder(forward).reverse().toString();
        return reverse.equals(forward);
    }
}
