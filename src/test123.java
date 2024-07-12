import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test123 {
    public static void main(String[] args) {
        try {
            File f = new File("voterlist.csv");
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            fos.write("hello how are you".getBytes());
            fos.close();
            System.out.println("Data has been written to the file.");

            File f1 = new File("C:\\Users\\srial\\Downloads\\Screenshot_29-4-2024_151643_.jpeg");
            File f2 = new File("C:\\Users\\srial\\Downloads\\copy.jpeg");

            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos2 = new FileOutputStream(f2);

            int b;
            while ((b = fis.read()) != -1) {
                fos2.write(b);
            }

            fis.close();
            fos2.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
