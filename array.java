import java.util.Scanner;
public class array {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String [][][] food = {
         {
            {"fruits","banana","apple","pineapple","cherry"},
            {"Main dish","adobo","letchon","kaldereta","humba"},
                  },
                { 
            {"vegetabale","carrots","ampalaya","radish","eggplant"},
            {"Dessert","ice cream","maccarons","spagete","mangofloat"},
                }
            };

            for(int i = 0; i < food.length; i++){
                System.out.println("=== Group" + (i + 1) + "===");

                for(int j = 0; j < food[i].length;j++){
                    System.out.println("category:" + food[i][j][0]);
                    for(int k = 1;k < food[i][j].length;k++){
                        System.out.println("-" + food[i][j][k]);

            }
            System.out.println();
                    

        }
        input.close();

        
    }
    
}
}
