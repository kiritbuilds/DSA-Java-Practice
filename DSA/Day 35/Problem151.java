// Reverse Words In a String

public class Problem151 {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        String[] words = str.split("\\s+");
        for(int i=words.length-1; i>=0; i--){
            result = result + words[i] + " ";
        }
        System.out.println(result.trim());
    }
}
