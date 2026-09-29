public class Exercise2 {
    public static void main(String[]args) {

        String[][] students = {

            {"students1", "84,83"},
            {"students1", "86,67"},
            {"students1", "83,83"}

        };

            for(int i = 0; i < students.length;i++) {
                System.out.println("Avarage:" + students[i][0]);
                for(int j = 1; j < students[i].length; j++ ) {
                    System.out.println("-" + students[i][j]);
                }
                System.out.println();

                
            }
    }
}


    
