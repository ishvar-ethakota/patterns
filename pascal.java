 import java.util.*;
 class pascal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
                

            }
            System.out.print("\n");
        }


    }
    
}
