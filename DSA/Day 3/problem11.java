public class problem11 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 50};
        
        // 1. Maan lo ki array sorted hai (Optimistic approach)
        boolean isSorted = true; 

        for(int i = 0; i < arr.length-1; i++) {
            // 2. Sirf galti dhundo (Kya pichla wala agle se bada hai?)
            if (arr[i] > arr[i+1]) {
                isSorted = false; // Pakda gaya! Sorted nahi hai
                break; // Aage check karne ki zarurat nahi
            }
        }

        // 3. Loop ke baad faisla sunao
        if(isSorted) {
            System.out.println("True (Sorted Hai)");
        } else {
            System.out.println("False (Sorted Nahi Hai)");
        }
    }
}