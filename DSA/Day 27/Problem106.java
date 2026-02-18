// Palindrome Check
public class Problem106{
static boolean isPal(String s,int l,int r){
    if(l>=r){
        return true;
    }
    if(s.charAt(l)!=s.charAt(r)){
        return false;
    }
    return isPal(s,l+1,r-1);
}

    public static void main(String[] args){
        String s = "madam";
        System.out.println(isPal(s, 0, s.length()-1));        

    }
}