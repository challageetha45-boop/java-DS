import java.util.*;
    public class ArrayListExample{
        public static void main(String[] args){
            ArrayList<Integer> a=new ArrayList<>();
            a.add(10);
            a.add(20);
            a.add(30);
            a.add(40);
            a.add(50);
            a.add(2,70);
           for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
           }
        }
    }
    

