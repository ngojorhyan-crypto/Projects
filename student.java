import java.util.Scanner;
public class student {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        
        String [][] student = {
            {"student", "89.34"},
            {"student","90.34"},
            { "student","80.50"},
        
        };

        System.out.println("===student Average===");
        System.out.println("1.student");
        System.out.println("2.student");
        System.out.println("3.student");

        System.out.println("choose student");
        int choise = input.nextInt();

        if (choise >= 1 && choise <= 3){
            int index = choise-1;
            
            String name = student[index][0];
            double average = Double.parseDouble(student[index][1]);

            System.out.println("Name" + name);
            System.out.println("Average" + average);

            if(average > 76){
                System.out.println("Status: passed");

            }else{
                System.out.println(" Status: failed");




            
        }
        System.out.println("ivnalid choice! ");
        }
        input.close();

        

 

            }

        
        }
    

