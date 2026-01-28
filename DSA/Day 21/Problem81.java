// 4. Count Consonants

public class Problem81 {
    public static void main(String[] args) {
        String name = "Kirit";
        int Vowelscount = 0;
        int ConsonantsCount = 0;
        for (int i = 0; i < name.length(); i++) {
            // char ch = name.charAt(i);
            char ch  = Character.toLowerCase(name.charAt(i));
            // Ek Main Ke Pehle String na badha ne small kari to badhu lakhvu no pade
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    // || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                {
                Vowelscount++;
            }else if(ch >= 'a' && ch <= 'z'){
                ConsonantsCount++;
            }
        }
        System.out.println("Vowel In This String = " + Vowelscount);
        System.out.println("Consonants In This String = " + ConsonantsCount);
    }
}
