public class Exercise1 {
    public static void main(String[]args) {

        int[][] matrix =  {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}

        };

        for(int i = 0; i < matrix.length;i++){
            int sum = 0;

            for(int j = 0; j < matrix [i]. length; j++ ){
                sum += matrix[i][j];
            }
             
            System.out.println("sum " + (i+1) + ":" + sum);
        }
    }


}
