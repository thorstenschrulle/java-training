import java.io.*;
import java.util.Properties;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("test.txt");
        File file_target = new File("test_Copy.txt");

        FileReader fr;
        FileWriter fw;
        PrintWriter pw;

        String line;
        int i = 1;
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            while (( line = bf.readLine()) != null) {
                System.out.println(i + " " + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;

            /*
            String line;
            int i = 1;
            while ((line = bfr.readLine()) != null) {
                System.out.println(i + " " + line);

                i++;
            }

            pw.close();
*/


    }
}
