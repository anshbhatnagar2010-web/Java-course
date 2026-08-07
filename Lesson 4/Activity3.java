import java.util.Scanner;
    class Activity3 {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);

        System.out.println ("Enter first number: ");
        int first = scn.nextInt();
        
        System.out.println ("Enter second number: ");
        int second = scn.nextInt();
        
        scn.nextLine();

        System.out.println ("Enter the operator: ");
        String operator = scn.nextLine();

    scn.close();
    
        switch (operator){
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}
