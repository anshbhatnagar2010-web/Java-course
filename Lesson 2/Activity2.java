class Activity2{
    public static void main(String[]args) {
        int a=10;
        int b=5;

        System.out.println("===========Guess the Answers===========");

        System.out.println("Unary Operator"+(a++));
        System.out.println("unary Operator"+(++b));
        System.out.println("Binary Operator");
        System.out.println("1+2 " +1+2);
        System.out.println("1+2 "+(1+2));
        System.out.println(1+2 + " =3");
        int increment = ++a * b++;
        System.out.println(increment);


        System.out.println("Ternary Operator");
        int largestNum = (a>b)?a:b;
        System.out.println("Largest Number between a and b is: "+largestNum);
    }
}