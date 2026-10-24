abstract class Object{
    abstract void showShape();
    public void shape(){
        
        System.out.println("Abstract class");
    

    }
}
class Sphere extends Object{
    void showShape(){
        System.out.println("Object is Sphere");
    }
}
class Cuboid extends Object{
    void showShape(){
        System.out.println("Object is Cuboid");
    }
}

class Prism extends Object{
    void showShape(){
        System.out.println("Object is Prism");
    }
}


public class Activity2{
    public static void main(String[] args){
        Object obj= new Sphere();
        obj.shape();
        obj.showShape();
        obj= new Cuboid();
        obj.shape();
        obj.showShape();
        obj= new Prism();
        obj.shape();
        obj.showShape();
        
    }
}