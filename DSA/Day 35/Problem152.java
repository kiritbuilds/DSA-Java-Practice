// Check if String only contain digit 

public class Problem152{
    public static void main(String[] args) {
        String str = "12345";
        boolean isDigit = true;
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(ch<'0' || ch>'9'){
                isDigit = false;
                break;
            }
        }
        if(isDigit){
            System.out.println("Yes");  
        }else{
            System.out.println("No");
        }
    }
}