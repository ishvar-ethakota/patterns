public class patt13 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                if(k==1||k==i)
                {
                    System.out.print("*");
                }
                else if(i==n)
                {
                    System.out.print("**");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
            
        }
    }
}
