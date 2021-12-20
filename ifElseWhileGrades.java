package Belajar;
import java.util.Scanner;
public class ifElseAgesWhileGrades {
    public static void main(String[] args) {
        Scanner jawab1 = new Scanner(System.in);
        int input1 = -1; // value jangan sampai menyamai inputan while


        while (input1 < 0 || input1 > 100) {

            System.out.println("------------------");
            System.out.print("Berapa umurmu? : ");
            input1 = jawab1.nextInt();

            if (input1 < 0 ) {
                System.out.println("Jangan berada dibawah nilai 0");
            }else if(input1 <=60){
                System.out.println("Anda mendapat D");
            } else if (input1 <= 70) {
                System.out.println("Anda mendapat C");
            } else if (input1 <= 80) {
                System.out.println("Anda mendapat B");
            } else if (input1 <= 90) {
                System.out.println("Anda mendapat A");
            } else if (input1 <= 100) {
                System.out.println("Anda mendapat A+");
            }else{
                System.out.println("Jangan berada di atas nilai 100");
            }

        }
        System.out.println("---Program berakhir.....");

    }
}
