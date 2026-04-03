// anagram check first length check then sort then equals 

import java.util.Arrays;

// User function template for Java
class Problem166 {
    static int areAnagram(String S1, String S2) {
        // code here
        if (S1.length() != S2.length()) {
            return 0;
        }

        char[] arr1 = S1.toCharArray();
        char[] arr2 = S2.toCharArray();

        // Dono ko ABCD ke order mein sort kar do
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Kya dono ab ekdum judwa bhai lag rahe hain?
        // Agar equals hain (?) toh 1 return karo, warna (:) 0 return karo
        return Arrays.equals(arr1, arr2) ? 1 : 0;
    }
}