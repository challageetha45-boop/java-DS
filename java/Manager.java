import java.util.ArrayList;
import java.util.Collections;
public class Manager {
    public static void main(String[]args){
        
        Employee e1=new Employee(1,"vishnu",50000,"trainer",35);
        Employee e2=new Employee(2,"apple",80000,"trainer",40);
        Employee e3=new Employee(3,"cherry",90000,"trainer",28);
        Employee e4=new Employee(4,"bunny",40000,"trainer",18);
        Employee e5=new Employee(5,"bujji",10000,"trainer",38);
        ArrayList<Employee> a=new ArrayList<>();
       a.add(e1);
       a.add(e2);
       a.add(e3);
       a.add(e4);
       a.add(e5);
       Collections.sort(a);
       for(Employee e:a){
           System.out.println(e);
       }
    }
}
    

