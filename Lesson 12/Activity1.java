interface MyInterface {
    public void myMethod1();
    public void myMethod2();
}

class Activity1 implements MyInterface {
    public void myMethod1(){
        System.out.println("Implementation of myMethod1");
    }

    public void myMethod2(){
        System.out.println("Implementation of myMethod2");
    }
    public static void main(String[] args){
        MyInterface obj = new Activity1();
        obj.myMethod1();
        obj.myMethod2();
    }
}
