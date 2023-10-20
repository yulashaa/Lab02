public class Main {
    public static void main(String[] args) {
        Stack stack = List.emptyStack();

        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(2);

        stack.forEach((n) -> System.out.print(n * 2 + " "));
    }
}