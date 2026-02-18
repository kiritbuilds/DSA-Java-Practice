// Print all subsequences

public class Problem117 {
    static void subseq(String str, int index, String result){

        // Base Case
        if(index == str.length()){
            System.out.println(result);
            return;
        }

        char ch = str.charAt(index);

        // INCLUDE the current character
        subseq(str, index + 1, result + ch);

        // EXCLUDE the current character
        subseq(str, index + 1, result);
    }

    public static void main(String[] args) {
        subseq("abc", 0, "");
    }
}        