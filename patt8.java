public class patt8{
    public static void main(String[] args) {
        int n =10;
        for(int i=1;i<n;i+=2)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                
                System.out.print(" *");
            }
            System.out.println("\n");
        }
    }
}