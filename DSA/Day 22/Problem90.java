// Check anagram

public class Problem90 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        int i;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Length Check
        if (str1.length()!=str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[256];

        // Store character for his ascii value 
        for(i=0; i<str1.length(); i++){
            freq[str1.charAt(i)]++;
        }

        // same character are subtract 
        for(i=0; i<str2.length(); i++){
            freq[str2.charAt(i)]--;
        }

        // Because all are zero then it's anagram another is not anagram
        for(i=0; i<256; i++){
            if(freq[i] != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Strings are anagram");
    }
}
