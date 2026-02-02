// Frequency of characters

public class Problem96 {
    public static void main(String[] args) {

        String str = "banana";
        int[] freq = new int[256];

        // Step 1: count frequencies
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }

        // Step 2: print frequency (unique order)
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(freq[ch] > 0){    // print only once
                System.out.println(ch + " => " + freq[ch]);
                freq[ch] = 0;    // so it doesn't print again
            }
        }
    }
}
