class Person
{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void displaydetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person
{
    double salary;
    Employee(String name,int age,double salary)
    {
        super(name,age);
        this.salary=salary;
    }
    void displayEmp()
    {
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee
{
    String department;
    Manager(String name,int age,double salary,String department)
    {
        super(name,age,salary);
        this.department=department;
    }
    void displayM()
    {
        System.out.println("Department: "+department);
    }
}
public class multilevel
{
    public static void main(String args[])
    {
        Manager m=new Manager("Ashwath N",21,200000,"HR");
        m.displaydetails();
        m.displayEmp();
        m.displayM();
    }
}
