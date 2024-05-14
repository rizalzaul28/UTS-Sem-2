package Reversed_Strings;

import java.util.Scanner;
public class Kata {
    public static String reverseString(String input) {
        // Membuat objek StringBuilder untuk memanipulasi string
        StringBuilder reversed = new StringBuilder();
       
        // Mengiterasi melalui string input dari belakang dan menambahkannya ke StringBuilder
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        // Mengembalikan hasil string yang telah dibalik
        return reversed.toString();
    }
    
    // Sampel test di Codewars menggunakan method solution,
    // jadi kita perlu menambahkan method solution yang memanggil reverseString
    public static String solution(String input) {
        return reverseString(input);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan string yang ingin dibalik: ");
        String input = scanner.nextLine();
        
        // Memanggil method reverseString dengan input yang dimasukkan pengguna dan mencetak hasilnya
        System.out.println("Hasil pembalikan: " + reverseString(input));
        
        // Menutup objek Scanner setelah digsunakan
        scanner.close();
    }
}