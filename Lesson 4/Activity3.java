import java.util.Scanner;
class Activity 3{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        String operator = scn.nextLine();

        System.out.println ("Enter first number: ");
        System.out.println ("Enter second number: ");
        System.out.println ("Enter the operator: ");

        switch (operator){
            case "+"{
                System.out.println(first + second);
                break;
            }
        }
    }
}