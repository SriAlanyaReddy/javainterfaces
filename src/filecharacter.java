import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class filecharacter {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\srial\\OneDrive\\Desktop\\Hyd\\Kmit");
        f.mkdirs();
        // Provide the full path for f2
        File f2 = new File(f, "voterslist.txt");
        f2.createNewFile();
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(f2);
        for(int i=0;i<3;i++)
        {
            String name = sc.next();
            int age = sc.nextInt();
            System.out.println("ENTER NAME AND AGE");
            fw.write(name + "," + age+"\n");
        }
        fw.close();
    }
}