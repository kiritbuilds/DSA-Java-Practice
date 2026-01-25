// 11. Linear search

public class Problem68 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 30;
        boolean found = false;
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]==target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Targeted Element Is Found At Index " + i);
        }else{
            System.out.println("Targeted Element Is Not Found");
        }
    }
}
