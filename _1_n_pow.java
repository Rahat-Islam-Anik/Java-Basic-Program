package javaallprogram;
public class _1_n_pow {
    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+Math.pow(i,2);
        }
        System.out.println(sum);
        
    }
}
