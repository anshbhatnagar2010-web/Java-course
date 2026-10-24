import java.util.Scanner;

class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
             
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number:");
        int num2 = scanner.nextInt();

        int divide = num1/num2;
        System.out.println( num1 + " divived by " + num2 + " is: " + divide);
        }
        catch(ArithmeticException ex){
            System.out.println("Catch Block");
            System.out.println(ex.toString());
        
        }finally{
            System.out.println("Done");
        }
        scanner.close();

    }
       
}