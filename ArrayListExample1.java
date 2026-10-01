import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
           a.add(sc.next());
        }
        for(String i:a){
            System.out.println(i+" ");
            
        }
    }
}
