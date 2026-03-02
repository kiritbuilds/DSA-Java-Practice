// Find Pair With Given Sum

public class Problem154{
    public static void main(String[] args){
        int[] arr = {1,4,45,6,10,-8};
        int sum = 16;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j])==sum){
                    System.out.println("Pair Found: ( " + arr[i] + ", " + arr[j] +  ")");
                    found = true;
                    return;
                }
            }
        }
        if(!found){
            System.out.println("No Pair Is Found ");
        }
    }
}