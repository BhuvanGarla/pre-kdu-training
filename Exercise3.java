import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
    
        String fileName = "/Users/bhuvang/pre-kdu-training/pre-kdu-training/Read.csv";

        ArrayList<String>List1= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] words = line.split(" ");


                for (String word : words) {
                    int n = word.length();
                    String s1 = word.substring(0, n-1 );
                    List1.add(s1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String element : List1) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        LinkedHashMap<String, Integer> sortedMapByValueDesc = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
                .forEachOrdered(x -> sortedMapByValueDesc.put(x.getKey(), x.getValue()));


        int i =0;
        for (Map.Entry<String, Integer> entry : sortedMapByValueDesc.entrySet()) {
            String key = entry.getKey();
            System.out.println( key );
            i++;
            if(i==3){
                break;
            }
        }
    }
}