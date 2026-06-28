public class Problem180 {
    public static void main(String[] args) {
        int a = 26;
        int b = 27;
        int c = 28;
        if(a>=b&&a>=c){
            System.out.println("Largest = " + a);
        }else if(b>=c && b>=a){
            System.out.println("Largest = " + b);
        }else{
            System.out.println("Largest = " + c);
        }
    }
}
