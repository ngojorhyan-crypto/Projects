public class rhyan {
    public static void main (String [] args) {
        int number = 5;

        
        for(int i = 1; i <= number; i++) {

            for (int j = i; j <= number; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower bracket
          for (int i = number - 1; i >= 1; i--) {

            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
          }      


            
        }
        
        }
    
