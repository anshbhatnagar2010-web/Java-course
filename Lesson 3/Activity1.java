import java.util.*;
class Activity1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x=sc.nextInt();
        if(x>10){
            System.out.println("The number is greater than 10");
        }else if (x<10){
            System.out.println("The number is less than 10");
        }else{
            System.out.println("The number is equal to 10");
        }
    }
}