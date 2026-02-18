// GCD Greatest Common Division

public class Problem108 {
    static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(GCD(12, 18));
    }
}
