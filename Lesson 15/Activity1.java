//generate a program for inheritance! All the best
class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println("This animal's name is: " + name);
    }
    public void makeSound(){
        System.out.println("The animal says: ");
    }
}

class Mouse extends Animal{
    public Mouse(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("This animal says 'sqeak sqeak'");
    }
}

class Cat extends Animal{
    
    public Cat(String name){
        super(name);
    }
    @Override 
    public void makeSound(){
        System.out.println("This animal says 'meow'");
    }
}

class Activity1{
    public static void main(String []args){
        Animal a = new Animal("Animal");
        Animal m = new Mouse("Jerry");
        Animal c = new Cat("Lucy");
        a.makeSound();
        c.makeSound();
        m.makeSound();
    }
}