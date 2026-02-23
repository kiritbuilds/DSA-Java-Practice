// Check if String is Palindrome

public class Problem142 {
    public static void main(String[] args) {
        String str = "radar";
         String rev = "";
         boolean found = true;
        // System.out.println(new StringBuilder(str).reverse().toString());

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == rev.charAt(i)){
                found = true;
            }
        }
        if(found){
            System.out.println("It Is A Palindrome");
        }else{
            System.out.println("It Is Not A Palindrome");
        }
    }
}
