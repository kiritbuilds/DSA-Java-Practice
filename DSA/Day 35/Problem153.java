// Find length of string without using length()

public class Problem153 {
    public static void main(String[] args) {
        String str = "hello";
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Length is: " + count);
        }
    }
}
