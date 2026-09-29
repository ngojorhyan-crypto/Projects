public class raph {
    public static void main(String[] args) {
        String [][] food = {
            {"fruits","banana","cherry","apple","pineapple"},
            {"Main dish","adobo","kaldireta","letchon","humba"},
            {"disert","ice cream","macaroni","spahgete","mangofloat"},

        };

        for(int i = 0; i < food.length; i++){
            System.out.println("category:" + food[i][0]);

            for(int j = 1; j < food[i].length;j++){
                System.out.println("-" + food[i][j]);
            }
            System.out.println();

    
    
}
    }
}
