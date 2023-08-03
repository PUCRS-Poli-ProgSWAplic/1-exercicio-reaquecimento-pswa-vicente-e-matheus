import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintTxt implements Print{
      private String currDir = Paths.get("").toAbsolutePath().toString();
      private String nameComplete = currDir + "\\" + "Incremental.txt";
      private Path path = Paths.get(nameComplete);

      public PrintTxt() {

      }

      

      @Override
      public void print() {
            try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
                  
                  for (int i = 0; i < 10; i++) {
                        Incremental inc = Incremental.getInstance();
                        writer.print(inc.toString() + "\n");
                  }
            } catch (IOException x) {
                  System.err.format("Erro de E/S: %s%n", x);
            }
      }

      
      
}
