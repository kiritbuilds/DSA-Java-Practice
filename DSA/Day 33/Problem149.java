// 8. Check if two strings are anagram 

public class Problem149 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Step 1: Agar length hi alag hai, toh Anagram ho hi nahi sakta!
        if (str1.length() != str2.length()) {
            System.out.println("It Is Not A Anagram");
            return; // Program yahin band kar do
        }

        // Step 2: Ek Jasoos array banayenge jo yaad rakhega kaunsa letter 'Use' ho gaya
        boolean[] visited = new boolean[str2.length()];
        boolean isAnagram = true; // Shuru mein maan lo ki yeh Anagram hai

        // Outer loop: str1 ka ek-ek letter uthao
        for (int i = 0; i < str1.length(); i++) {

            boolean found = false; // Is wale specific letter ke liye search shuru

            // Inner loop: str2 mein is letter ko dhundo
            for (int j = 0; j < str2.length(); j++) {

                // Agar letter match ho gaya AUR wo pehle use na hua ho (visited == false)
                if (str1.charAt(i) == str2.charAt(j) && visited[j] == false) {
                    visited[j] = true; // Isko 'Tick' kar do (Use ho gaya)
                    found = true; // Mil gaya!
                    break; // Mil gaya toh aage dhundne ki zaroorat nahi
                }
            }

            // Agar pura andar wala loop ghum liya, aur yeh letter nahi mila!
            if (found == false) {
                isAnagram = false; // Toh matlab gadi kharab hai, Anagram nahi hai
                break; // Bahar wala loop bhi tod do
            }
        }

        // Final Result (Sab kuch check hone ke baad)
        if (isAnagram) {
            System.out.println("It Is A Anagram");
        } else {
            System.out.println("It Is Not A Anagram");
        }
    }
}