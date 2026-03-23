import java.io.*;
import java.util.Scanner;

public class TryCatchFileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            FileWriter fw = new FileWriter("file1.txt");
            fw.write(text);
            fw.close();

            System.out.println("File written successfully.");

            
            System.out.println("\n--- File Content ---");
            File file = new File("file1.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

            FileReader fr = new FileReader("file1.txt");
            FileWriter fw2 = new FileWriter("file2.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw2.write(ch);
            }

            fr.close();
            fw2.close();

            System.out.println("\nFile copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
} 
