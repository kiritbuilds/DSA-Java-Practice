// Tower Of Hanoi

public class Problem113 {
    static void hanoi(int n, char from, char to, char aux) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Step 1: Move n-1 from 'from' to 'aux'
        hanoi(n - 1, from, aux, to);

        // Step 2: Move current disk
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Step 3: Move n-1 from 'aux' to 'to'
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'C', 'B');
    }
}
