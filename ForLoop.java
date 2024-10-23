public class ForLoop {
    public static void main(String args[]) {
        for(int i = 1; i <= 10; i++) {
            System.out.print(" ".repeat(10 - i));
            System.out.println("*".repeat(2 * i - 1));
        }
    }   
}