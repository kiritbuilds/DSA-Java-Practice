// Toggle Case
// Uper Hoy e Lower Thay Jay And Lower Hoy e Upeer

public class Problem93 {
    public static void main(String[] args) {
        String str = "KiRiT";
        String result = "";
        int i;
        for(i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                result = result + (char)(ch+32);
            }
            else if(ch >= 'a' && ch <= 'z'){
                result = result + (char)(ch-32);
            }else{
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}