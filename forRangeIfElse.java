package Belajar;

import java.util.Objects; //perintah method untuk memasukkan Object.equals
import java.util.Scanner;
public class forRangeIfElse {
    public static void main(String[] args) {
        Scanner jawab = new Scanner(System.in);
        String pass = "yusuf";
        for (int i =1; i<=3;i++) {
            System.out.print("Input your password: ");
            String jawab1 = jawab.nextLine();

            if (Objects.equals(jawab1, pass)) {
                System.out.println("Your password is correct");
                break;
            }
            else {
                System.out.println("Incorrect, Try Again");

            }


        }
    }
}
