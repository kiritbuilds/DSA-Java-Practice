// Find duplicate characters

public class Problem88 {
    public static void main(String[] args) {
        String name = "banana";
        int i;
        name = name.toLowerCase(); // Optional

        int[] freq = new int[256]; // Ascii Frequency

        for(i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            freq[ch]++;
        }
        System.out.println("Duplicate Characters ");

        for(i=0; i<256; i++){
            if(freq[i] >=2){
                System.out.print((char)i + " ");
            }
        }
    }
}
