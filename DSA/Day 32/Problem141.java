// 1. Reverse A String

public class Problem141{
    public static void main(String[] args){
        String str = "hello";
        String rev = "";
        // System.out.println(new StringBuilder(str).reverse().toString());

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        System.out.println("Original " + str);
        System.out.println("Reversed " + rev);

    }
}