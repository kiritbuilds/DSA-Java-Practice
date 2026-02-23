// 6. Cound Words In a String 

public class Problem147 {
    public static void main(String[] args) {
        String str = "Hello world how are you";
        String[] words = str.trim().split("\\s+");
        System.out.println(words.length);
    }
}
