// Remove duplicates from string

public class Problem150 {
    public static void main(String[] args) {
        String str = "geeksforgeeks"; // Original line
        String result = ""; // Khali VIP Club

        // Outer loop: Ek-ek karke naya banda darwaze par aayega
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // Naya banda
            boolean isAlreadyInside = false; // Shuru mein maan lo naya hai

            // Inner loop (Bouncer): VIP club (result) ke andar check karo
            // Dhyan do: Yeh str.length() tak nahi, result.length() tak chalega!
            for (int j = 0; j < result.length(); j++) {

                // Agar naya banda aur club ke andar baitha banda same hain
                if (ch == result.charAt(j)) {
                    isAlreadyInside = true; // Pakda gaya!
                    break; // Aage check karne ki zaroorat nahi
                }
            }

            // Bouncer ki checking ke baad, agar banda sach mein naya hai
            if (isAlreadyInside == false) {
                result = result + ch; // Club mein entry de do
            }
        }

        System.out.println("String without duplicates: " + result);
        // Output: geksfor
    }
}