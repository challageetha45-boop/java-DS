public class PlatinumCustomer{
int id;
String name;
String mobno;
String email;
double credits;
public customer(int id,String name,String mobno,String email,double credits){
    this.id=id;
    this.name=name;
    this.mobno=mobno;
    this.email=email;
    this.credits=credits;
}
public void display(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(mobno);
    System.out.println(email);
}
}
