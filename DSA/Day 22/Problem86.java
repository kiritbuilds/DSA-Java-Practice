// Remove Spaces

public class Problem86 {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        String result = str.trim();
        String result1 = str.replace(" ", "");
        System.out.println(result);
        System.out.println(result1);
    }
}
