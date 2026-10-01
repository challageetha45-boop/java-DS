public class ArrayMin {
    public static void main(String[] args){
        int[] a={40,50,30,20,10};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
       
        }
        System.out.println(sum-max);
        System.out.println(sum-min);
    }
    
}
