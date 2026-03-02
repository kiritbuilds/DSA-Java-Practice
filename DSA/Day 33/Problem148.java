// 7. First Non-repeating Character

public class Problem148 {
    public static void main(String[] args) {
        String str = "geeksforgeeks"; 
        
        // Outer loop: Ek-ek character uthayega
        for (int i = 0; i < str.length(); i++) {
            
            boolean isUnique = true; // Jasoos: Shuru mein maan lo ki akela hai
            
            // Inner loop: PURI string mein check karega (0 se end tak)
            for (int j = 0; j < str.length(); j++) {
                
                // i != j zaroori hai, warna woh 'g' ko khud usi 'g' se match karke duplicate bata dega!
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false; // Judwa mil gaya!
                    break; // Aage check karne ki zaroorat nahi
                }
            }
            
            // Agar puri string ghumne ke baad bhi isUnique true raha, toh answer mil gaya!
            if (isUnique) {
                System.out.println("First non-repeating character is: " + str.charAt(i)); // Output: 'f' 
                break; // Bahar wala loop bhi tod do, kyunki humein sirf PEHLA wala chahiye
            }
        }
    }
}