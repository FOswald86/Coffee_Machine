import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == n1 && array[i + 1] == n2 || array[i] == n2 && array[i + 1] == n1) {
                count++;
            }
        }
        System.out.println(count == 1);
    }
}