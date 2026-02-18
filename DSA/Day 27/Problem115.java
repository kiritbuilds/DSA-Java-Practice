// Remove Duplicate String

public class Problem115 {

    static boolean[] visited = new boolean[256];
    static void removeDup(String str, int index, String result) {

        // 1) Base Case
        if(index == str.length()) {
            System.out.println(result);
            return;
        }

        char ch = str.charAt(index);

        // 2) Check if char visited
        if(!visited[ch]) {
            visited[ch] = true;                         // mark visited
            removeDup(str, index + 1, result + ch);     // include char
        }
        else {
            removeDup(str, index + 1, result);          // skip duplicate
        }
    }

    public static void main(String[] args) {
        String str = "aabbccddeeffgghh";
        removeDup(str, 0, "");
    }
}