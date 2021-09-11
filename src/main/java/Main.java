import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private Map<Integer, Integer> scoresForUpdate;

    private void getScoresForUpdate() {
        scoresForUpdate = new HashMap<>();
        try {
            File file = new File("update.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    String[] parts = line.split(" ");
                    scoresForUpdate.put(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
