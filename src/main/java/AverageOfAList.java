
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }

        int sum = 0;
        for (int iterate: list) {
            sum = sum + iterate;
        }

        System.out.println("");
        if (list.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("Average: " + (double) sum / list.size());
        }
    }
}
