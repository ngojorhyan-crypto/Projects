import java.util.Scanner;
public class rhyan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [][]foods= {
            {"fruits","banana","cherry","apple","pineapple"},
            {"Main dish","adobo","kaldireta","letchon","humba"},
            {"disert","ice cream","macaroni","spahgete","mangofloat"},
        
    };
    System.out.println("=== menu===");
    System.out.println("1. fruits");
    System.out.println("2. main dish");
    System.out.println("3. disert");

    System.out.println("choice your order");
    int order = input.nextInt();

    if ( order >=1 && order <= 3) {
    int index = order-1;
    System.out.println("category:" + foods [index][0]);

    for(int j = 1;j < foods[index].length;j++ ){
        System.err.println("-" + foods[index][j]);

    }

    } else {
    System.out.println("invald input!");


    }
    input.close();
     





    
}
}
