public class Tugas4 {
    public static void main(String[] args) {
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 6; b++) {
                if (a == 2) 
                    if (b % 2 == 1) {
                        System.out.print(" 0");
                    } else {
                        System.out.print(" S");
                    } 
                else {
                    if (b % 2 == 1) {
                        System.out.print(" S");
                    } else {
                        System.out.print(" 0");
                    }
                }
                }
                System.out.println();   
            }
        }
    }

