

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
