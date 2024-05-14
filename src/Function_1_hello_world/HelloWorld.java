package Function_1_hello_world;

public class HelloWorld {
      public static String greet() {
    return "hello world!";
  }
  public static void main(String[] args) {
    // Panggil metode greet untuk menguji fungsinya
    String greeting = greet();
    System.out.println(greeting);
  }
}