// Multiply Odd Indexed elements by 2 and add 10 to even indexed elements.

public class Problem161{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int i;
        for(i=0; i<arr.length; i++){
            if(i%2!=0){
                arr[i]*=2;
            }else{
                arr[i]+= 10;
            }
            System.out.print(arr[i]+" ");
        }
    }
}