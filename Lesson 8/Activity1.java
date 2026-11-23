

class Parent
{
    int age, id;
    String name;
    void naming(String name)
    {
        System.out.println("Name: " + name);
    }
}


//Child class

class Child extends Parent
{
    void ageN(int age)
    {
        System.out.println("Age of the child: " + age);
    }
}
public class Activity1{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.naming("Alice");
        c.ageN(10);
    }
}