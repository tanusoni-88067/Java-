import java.io.*;
//Tanu Soni
public class LexAnalyzer {
  static boolean analyze(String line) {
    if (line.length() >= 2)
      return line.substring(0, 2).equals("//");
    return false;
  }
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java LexAnalyzer <file>");
    } else {
      try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
        String str;
        while ((str = br.readLine()) != null) {
          str = str.trim();
          if (analyze(str)) {
            System.out.println(str);
          }
        }
        br.close();
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
  }
}
// This is a line of comment
