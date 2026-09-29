import java.io.*;
public class rhiven {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello world!\n");
            writer.write("this is a text file.\n");
            writer.close();
            System.out.println(" your Filewritten successfully");
        }catch (IOException e){
            System.out.println("Error:" + e.getMessage());
        
    }
}
}
