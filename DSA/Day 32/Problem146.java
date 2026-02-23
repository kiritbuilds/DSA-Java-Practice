// 5. Covert UpperCase to LowerCase

public class Problem146 {
    public static void main(String[] args) {
        String str = "HeLLo";
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);

            if(Character.isUpperCase(ch)){
                result = result + Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)){
                result = result + Character.toUpperCase(ch);
            }else{
                result = result + ch;
            }
        }
        System.out.println("Uper to Lower Is A " + result);
    }
}
