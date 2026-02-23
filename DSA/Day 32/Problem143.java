// 3. Count vowels And Consonanats

public class Problem143 {
    public static void main(String[] args) {
        String str = "hello world";
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }else if(ch>='a'&&ch<='z'){
                consonantCount++;
            }
        }
        System.out.println("Vowels = " + vowelCount);
        System.out.println("Consonants = " + consonantCount);
    }
}
