import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream inputStream1 = new FileInputStream(fileName1);
        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream1.available() > 0) {
            int data = inputStream1.read();
            list.add(data);
        }

        inputStream1.close();

        FileInputStream inputStream = new FileInputStream(fileName2);
        FileOutputStream outputStream = new FileOutputStream(fileName1);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }

        inputStream.close();

        for (int i=0; i<list.size(); i++) {
            outputStream.write(list.get(i));
        }

        outputStream.close();

    }
}
