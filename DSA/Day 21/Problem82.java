// 5. Reverse String

public class Problem82 {
    public static void main(String[] args) {
        // Method 1
        // String OriginalStr = "Kirit";
        // String ReversedStr = new StringBuilder(OriginalStr).reverse().toString();
        // System.out.println(ReversedStr);

        // Method 2
        String OriginalStr = "Kirit";
        String ReversedStr = "";

        for(int i=OriginalStr.length()-1; i>=0; i--){
            ReversedStr = ReversedStr + OriginalStr.charAt(i);
        }
        System.out.println(ReversedStr);
    }
}
