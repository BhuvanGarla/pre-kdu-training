import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " strings:");

        for (int i = 0; i <=n; i++) {
            String input = scanner.nextLine();
            list.add(input);

            set.add(input);

            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        System.out.println("\nList Contains:");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("\nSet Contains:");
        for (String str : set) {
            System.out.println(str);
        }

        System.out.println("\nFrequency of the words:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }
    }
}

