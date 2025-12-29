import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello Java File Handling");
        fw.close();
    }
}
