// Longest Word
// String No Motama Moto Words

public class Problem94 {
    public static void main(String[] args) {
        String str = "I Love Java Programming Language";
        str = str.trim();
        String[] words = str.split("\\s+");
        String longest = "";
        for(String w: words){
            if(w.length() > longest.length()){
                longest = w;
            }
        }
        System.out.println("Longest Words Is: " + longest);
    }
}