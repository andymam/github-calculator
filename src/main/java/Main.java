import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    while (true) {
      System.out.print("Enter command: ");
      String input = scanner.nextLine();
      String[] command = input.split(" ");  // Split the input into command and operands
      if (input.isEmpty()) {
        System.out.println("No command entered. Exiting...");
        break;
      }

      // Handle commands and call the corresponding method in Calculator class
      switch (command[0].toLowerCase()) {
        case "add":
          if (command.length == 3) {
            int addResult = calculator.add(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            System.out.println(addResult);
          }
          break;

        case "subtract":
          if (command.length == 3) {
            int subtractResult = calculator.subtract(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            System.out.println(subtractResult);
          }
          break;

        case "multiply":
          if (command.length == 3) {
            int multiplyResult = calculator.multiply(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            System.out.println(multiplyResult);
          }
          break;

        case "divide":
          if (command.length == 3) {
            int divideResult = calculator.divide(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            System.out.println(divideResult);
          }
          break;

        case "binary":
          if (command.length == 2) {
            String binaryResult = calculator.intToBinaryNumber(Integer.parseInt(command[1]));
            System.out.println(binaryResult);
          }
          break;

        case "fibonacci":
          if (command.length == 2) {
            int fibonacciResult = calculator.fibonacciNumberFinder(Integer.parseInt(command[1]));
            System.out.println(fibonacciResult);
          }
          break;

        default:
          System.out.println("Invalid command.");
          break;
      }
    }
  }
}
