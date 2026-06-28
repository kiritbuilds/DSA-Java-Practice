// Bubble Sort

class Problem171 {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++){
            boolean swapped = false; // Har naye round ke liye false
            
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true; // Swap hua, matlab list abhi sort nahi thi
                }
            }
            
            // Agar is poore round mein koi swap nahi hua, toh game over! Array is sorted.
            if(swapped == false){
                break; 
            }
        }
    }
}