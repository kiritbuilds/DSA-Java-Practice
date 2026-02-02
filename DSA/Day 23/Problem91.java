// First Non-repeating char 
// etle e character je pele repeat thayo na hoy e aakhi string ma jemke 
// Input: "swiss" Output: w

public class Problem91{
    public static void main(String[] args) {
        String str = "swiss";
        int i;

        int[] freq = new int[256];

        //Step:1 Count Frequency
        for(i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }

        // Find Non-repeating char
        for(i=0; i<str.length(); i++){
            if(freq[str.charAt(i)] == 1){
                System.out.println("First Non-repeating character is " + str.charAt(i));
                return;
            }
        }
        System.out.println("No Non-repeating character found ");
    }
}