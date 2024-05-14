package Remove_First_and_Last_Character;

import java.util.Scanner;

public class RemoveChars {
    public static String remove(String str) {
        if (str == null || str.length() < 2) {
            throw new IllegalArgumentException("Input string must have at least two characters.");
        }
        
        // Menggunakan substring() untuk mengambil substring dari karakter kedua sampai sebelum karakter terakhir
        return str.substring(1, str.length() - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan kata : ");
        String input = scanner.nextLine();
        
        // Menggunakan metode remove
        String removed = remove(input);
        System.out.println("Setelah remove: " + removed);
        
        scanner.close();
    }
}