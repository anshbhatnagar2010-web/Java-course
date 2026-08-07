import java.util.Scanner;

class Activity3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your assignment grade: ");
        int grade = scn.nextInt();
        
        scn.close();
        
        if (grade > 90){
            System.out.println("O");
        }else if (grade > 80){
            System.out.println("A+");
        }else if (grade > 70){
            System.out.println("A");
        }else if (grade > 60){
            System.out.println("B");
        }else{
            System.out.println("C");
        }

    }
}
