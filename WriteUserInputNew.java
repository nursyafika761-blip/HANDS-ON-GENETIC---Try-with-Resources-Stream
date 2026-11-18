import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteUserInputNew {

    public static void main(String[] args) {

        try (
            Scanner sc = new Scanner(System.in);
            BufferedWriter bw =
                Files.newBufferedWriter(Paths.get("user_input.txt"))
        ) {

            System.out.print("Masukkan teks: ");
            String text = sc.nextLine();

            bw.write(text);

            System.out.println("Data berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}