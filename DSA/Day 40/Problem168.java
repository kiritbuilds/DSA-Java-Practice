class Problem168 {
    public String reverseWords(String s) {
        
        // Step 1: Array mein tod lo
        String[] words = s.split("\\."); 
        
        // VIP Room
        StringBuilder result = new StringBuilder(); 
        
        // Step 2: Piche se loop chalao
        for (int i = words.length - 1; i >= 0; i--) {
            
            // THE BOUNCER: Sirf tabhi aage badho jab word khali ("") NA ho
            if (!words[i].isEmpty()) {
                
                // Agar room mein pehle se koi word baitha hai, 
                // toh naya word dalne se pehle unke beech mein dot (.) laga do
                if (result.length() > 0) {
                    result.append(".");
                }
                
                // Ab word ko result mein jodo
                result.append(words[i]);
            }
        }
        
        // Final answer wapas bhej do
        return result.toString();
    }
}