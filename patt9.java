public class patt9 {
    public static void main(String[] args) {
        int n = 10;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<(2*n)-2*i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
