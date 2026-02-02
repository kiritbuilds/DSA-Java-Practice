// Remove Special Characters
public class Problem92{
    public static void main(String[] args) {
        String str = "Kir!t@123#*";
        String result = "";
        int i;
        for(i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'A' && ch <= 'Z') ||
              (ch >= 'a' && ch <= 'z') ||
              (ch >= '0' && ch <= '9') ||
              ch == ' '){
                result = result + ch;
              }
        } 
        System.out.println("After Removing Special Character: " + result);
    }
}