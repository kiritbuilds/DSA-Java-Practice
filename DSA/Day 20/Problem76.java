//19. Merged Two Arrays

public class Problem76 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50};
        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;
        int i;
        for(i=0; i<arr1.length; i++){
            merged[k++] = arr1[i];
        }
        for(i=0; i<arr2.length; i++){
            merged[k++] = arr2[i];
        }
        for(i=0; i<merged.length; i++){
            System.out.print(merged[i] + " ");
        }        
    }   
}
