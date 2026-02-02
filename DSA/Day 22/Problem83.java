// Check Palindrome String

public class Problem83{
    public static void main(String[] args) {
        String name = "nayan";
        String rev = "";
        int i ;
        // Reverse  String
        for(i=name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }

        if(name.equals(rev)){
            System.out.println("It Is A Palindrome");
        }else{
            System.out.println("It Is A Not A Palindrome");
        }
    }
}