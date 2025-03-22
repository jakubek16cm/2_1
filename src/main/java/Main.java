// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Napisz tekst: ");
    String inputText = scanner.nextLine();

    String lowerCaseText = inputText.toLowerCase();
    System.out.println("Tekst w małych literach: " + lowerCaseText);

    scanner.close();
    
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}