//20. Find Pair With given sum means ki pair jinka sum target ke barabar ho print karo
public class Problem77 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 60;
        System.out.println("Pairs With Sum " + target + ":");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + "+" + arr[j] + "=" + target);
                }
            }
        }
    }
}
