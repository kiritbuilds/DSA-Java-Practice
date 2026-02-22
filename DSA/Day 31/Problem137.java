// 11. Linear Search

public class Problem137{
    public static void main(String[] args){
        int[] arr = {2,3,4,10,40};
        int target = 10;
        int i;
        boolean found = false;


        for( i=0; i<arr.length; i++){
            if(arr[i]==target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Yes Target Found At Index " + i);
        }else{
             System.out.println("No Target Is Not Found ");
        }
    }
}