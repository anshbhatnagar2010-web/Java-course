class Book { 
    private String title; 
    private String author; 
    private int numPages; 
    public Book(String t, String a, int np) { 
        title = t; 
        author = a; 
        numPages = np; 
    } 
public String getTitle(){ 
    return title; 
} 
public String getAuthor(){ 
    return author; 
} 
public int getNumPages(){ 
    return numPages; 
    } 
}


class Student{
    private String name;
    private String major;
    private int age;
    public void setStudent(String name, String major, int age){
        this.name = name;
        this.major = major;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public int getAge(){
        return age;
    }
}

    public class Activity1{
        public static void main(String []args){
            Student s = new Student();
            s.setStudent("Ansh","CS",16);
            System.out.println(s.getName());
            System.out.println(s.getMajor());
            System.out.println(s.getAge());

        }
    }

