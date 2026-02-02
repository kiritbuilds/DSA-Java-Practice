// Count Words

public class Problem87 {
    public static void main(String[] args) {
        String name = "  Kirit Kateshiya  ";
        String[] words = name.trim().split("\\s+");
        System.out.println(words.length);
    }
}
