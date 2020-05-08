public class DiagonalStar {
    public static void main(String arg[]) {
        printSquareStar ( 6 );
    }
    public static void printSquareStar(int number) {
        if (number < 5) System.out.println ( "Invalid Value" );
        /*for (int i = 1; i <= number; i++) {
            System.out.print ( "*" );
        }
        System.out.println ();*/
        int position = 2;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                //if (j == number) System.out.println ();
                int half = number / 2;
                int chet = number % 2;

                // print 1st str
                //
                if (i == 1) {
                    System.out.print ( "*" );
                }
                if ((i == 1) & (j == number)) System.out.println ();
                //print second str

                if ((i == 1)|(j == number)){

                    System.out.print ( "*" );

                }
                //position = position + 1;
                else System.out.print ( " " );


            }
            if (i == 1) System.out.println ();
        }
    }
}
