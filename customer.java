public class customer{
    int id;
    String name;
    String mobno;
    String email;
public customer(int id,String name,String mobno,String email){
    this.id=id;
    this.name=name;
    this.mobno=mobno;
    this.email=email;
}
public void display(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(mobno);
    System.out.println(email);
}
}