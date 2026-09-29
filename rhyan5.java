public class rhyan5 {
    public static void main(String[]args){
        String [][] foods = {
            {"Main dish","letchon","adobo","humba"},
            {"Vegetable","carots","Ampalaya","radish"},
            {"dissert","ice cream","macaroni","mangofloat"},

        };

        for (int i = 0; i<foods.length;i++){
            System.out.println("menu:"  + foods[i][0]);
            for(int j =1; j<foods[i].length;j++){
                System.out.println("-" + foods[i][j]);
            }
            System.out.println();
        }
    }
}