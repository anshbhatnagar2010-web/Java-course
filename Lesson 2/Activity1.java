class Activity1{
    public static void main(String[] args){
        int a=56;
        int b=27;
        int sum=a+b;
        int mult=a*b;
        int diff=a-b;
        float divis=a/b;

        String c="===========Simple Calculation===========";
        System.out.println(c);
        System.out.println("Addition of a & b: " + sum);
        System.out.println("Subtraction of a & b: " + diff);
        System.out.println("Multiplication of a & b: " + mult);
        System.out.println("Division of a & b: " + divis);
        System.out.println("Addition of a & b: " + (a+b));
        System.out.println("Subtraction of a & b: " + (a*b));
        System.out.println("Multiplication of a & b: " + (a-b));
        System.out.println("Division of a & b: "+ (a/b));
    }
}