
public class Practice {
    public static boolean[] map = new boolean[26];

    public static void endOfString(String s, int ind, String news) {
        if (ind == s.length()) {
            System.out.println(news);
            return;
        }
        char current = s.charAt(ind);
        endOfString(s, ind + 1, news);
        endOfString(s, ind + 1, news + current);

    }

    public static void main(String[] args) {
        String s = "abc";
        endOfString(s, 0, "");
    }
}
