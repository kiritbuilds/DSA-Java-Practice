public class Problem175 {
    public static void main(String[] args) {
        long facotial = 1;
        int n = 5;
        if(n==0 || n==1){
            System.out.println(1);
            return;
        }
        for(int i=2; i<=n; i++){
            facotial = facotial *i;
        }
        System.out.println(facotial);
    }
}
