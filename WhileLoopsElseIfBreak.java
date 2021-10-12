import java.util.Scanner;

public class WhileLoopsElseIfBreak {
    public static void main(String[] args) {

        int ulang=1;

        while(ulang==1) {
            String answer;
            int jawaban;
            Scanner Keyboard = new Scanner(System.in);

            while (true) {
                System.out.println("-----------------");
                System.out.println("---Coba - Coba---");
                System.out.println("-----------------");

                System.out.print("\nUmur\sberapa\sAnda? : ");
                answer = Keyboard.nextLine();

                jawaban = Integer.parseInt(answer);

                if (jawaban <= 0) {
                    System.out.println("Ulangi");
                }else if (jawaban <=5) {
                    System.out.println("Balita");
                    break;
                }else if (jawaban <= 10) {
                    System.out.println("Bocil");
                    break;
                }else if (jawaban <= 16) {
                    System.out.println("Anak -Anak");
                    break;
                }else if (jawaban <=21) {
                    System.out.println("Remaja");
                    break;
                }else if (jawaban <=49){
                    System.out.println("Dewasa");
                    break;
                }else {
                    System.out.println("Tua");
                    break;
                }
            }
            while (true) {
                System.out.println("---------------------");
                System.out.println("1. kembali");
                System.out.println("2. Exit");
                System.out.println("Apakah ingin mengulang? 1/2: ");
                ulang = Keyboard.nextInt();
                if (ulang <= 0 || ulang >= 3) {
                    System.out.println("Salah, Ulangi");
                } else {
                    break;
                }


            }



        }




    }
}
