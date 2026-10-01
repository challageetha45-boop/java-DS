public class Employee {
    int id;
    String name;
    String department; 
    double sal;
    public Employee(int id,String name,String department,double sal){
    this.id=id;
    this.name=name;
    this.department=department;
    this.sal=sal;
    }
    public void displayDetails(){
        System.out.println("id: "+id );
        System.out.println("name: "+name);
        System.out.println("department: "+department);
        System.out.println("sal: "+sal);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Geetha","CSE",90000);
        e1.displayDetails();
    }

}
