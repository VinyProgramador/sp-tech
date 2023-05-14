//Nome: Vinicius A Nunes
//RA: 01221125
public class App {
    public static void main(String[] args) {
        Integer[] array = {2,7,-3,-50,45,-4,30,-21,38};
        System.out.println("Exercise 1: ");
        separatesNegativePositiveInOrder(array);
        System.out.println("\n\nExercise 2: ");
        separatesNegativePositiveInOrderDiferent(array);
    }

    public static void separatesNegativePositiveInOrder(Integer[] array) {
        Queue<Integer> firstQueue = new Queue<>(array.length);
        Queue<Integer> secondQueue = new Queue<>(array.length);

        for (Integer numberTurn : array) {
            if (numberTurn >= 0) firstQueue.insert(numberTurn);
            else secondQueue.insert(numberTurn);
        }

        while (!firstQueue.isEmpty()) System.out.print(firstQueue.poll() + " ");
        while (!secondQueue.isEmpty()) System.out.print(secondQueue.poll() + " ");
    }

    public static void separatesNegativePositiveInOrderDiferent(Integer[] array) {
        Queue<Integer> queue = new Queue<>(array.length);
        Stack<Integer> stack = new Stack<>(array.length);

        for (Integer numberTurn : array) {
            if (numberTurn >= 0) queue.insert(numberTurn);
            else stack.push(numberTurn);
        }

        while (!queue.isEmpty()) System.out.print(queue.poll() + " ");
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }
}
