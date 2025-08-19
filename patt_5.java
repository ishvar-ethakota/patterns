class try_and_rev{
    public static void main(String[] args) {
        
    int n = 5;
    
        for (int i=0;i<n+1;i++)
        {
            if(i<n){
                for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            }
            else if (i==n)
            {
                for(int k=n;k>=0;k--){
                    for (int j=k;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
            }
                }
                

            }
        }
    
}
