public class Multimedia{
    public static void main(String[]args){
        
        String[][] Foods = {
            {"vegetables", "ampalaya", "carrots"},
            {"fruits", "mango", "banana"},
            {"meat", "chicken", "pork"},
            {"seafood", "shrimp", "crab"}
        };

        for (int i = 0; i < Foods.length; i++){
            System.out.println("Menu: " + Foods[i][0] );
            for (int j = 1; j < Foods[i].length; j++){
                System.out.println("-" + Foods[i][j] );
            }
            System.out.println();
        }

    }
}