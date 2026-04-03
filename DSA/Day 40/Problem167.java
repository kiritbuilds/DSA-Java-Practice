// Remove Duplicates From String

class Problem167{
    String removeDups(String s) {
        
        String result = ""; // Answer store karne ke liye khali string
        int[] arr = new int[256]; // Tumhara wala integer array
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            // Check: Kya yeh letter pehli baar aaya hai? (Count 0 hai?)
            if(arr[ch] == 0){
                result = result + ch; // Answer mein jod do
                arr[ch] = 1;          // Array mein 1 kar do (taaki agli baar ignore ho)
            }
        }
        
        return result; // Final string wapas bhej do
    }
}