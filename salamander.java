import java.util.Scanner;
public class salamander {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[][] food=new int[2][4];

        for(int i= 0; i < food.length;i++ ){
            for(int j=0; j < food[i].length;j++){

                System.out.println("enter food:");
                food[i][j]= input.nextInt();
            }
        }
           
     System.out.println("=== enter food===");
            for(int i=0;i < food.length;i++ ){
            for(int j=0; j < food[i].length;j++){
                System.out.print("-" + food[i][j]);

        } 
        System.out.println();

        }
        input.close();
        
    }
    
}
