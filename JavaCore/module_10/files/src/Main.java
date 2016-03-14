import utils.CaesarPasswd;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            BufferedReader textReader = new BufferedReader(new FileReader("input.txt"));

            List<String> text = new ArrayList<>();

            String line;

            while ((line = textReader.readLine()) != null) {
                text.add(line);
            }

            textReader.close();

            BufferedWriter textWriter = new BufferedWriter(new FileWriter("output.txt"));

            for (String o : text) {
                textWriter.write(CaesarPasswd.encode(o, 7));
                textWriter.write("\n");
            }

            textWriter.close();

            textReader = new BufferedReader(new FileReader("output.txt"));

            while ((line = textReader.readLine()) != null) {
                System.out.println(CaesarPasswd.decode(line, 7));
            }

            textReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
