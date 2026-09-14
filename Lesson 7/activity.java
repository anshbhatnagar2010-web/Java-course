
class Employee{
    String name;
    int empno;
    float salary;
    Employee(){
        System.out.println("***********");
        empno=101;
        name="David";
        salary=453.54f;

    }
    void Displaydetails(){
        System.out.println(empno +" | "+ name +" | "+salary);
    }

}
class activity{
    public static void main(String[] args){
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        emp1.Displaydetails();
        emp2.Displaydetails();
        emp3.Displaydetails();
    }
}
