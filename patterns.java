import java.util.*;

class Square1 {
    void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }
}
class r_tri {
    void tri1(int n) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }
}
class r_tri_rev {
    
    void tri2(int n) {
        int k=n;
        for (int i =n ; i >0; i--) {
            for (int j = i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
class r_tri_num {
    void tri3(int n) {
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        System.out.print("Enter the pattern number : ");
        int pat = sc.nextInt(); // Use int instead of char for pattern

        switch (pat) {
            case 1:
                Square1 ob = new Square1();
                ob.square(n);
                break;
            case 2:
                r_tri ob1 = new r_tri();
                ob1.tri1(n);
                break;
            case 3:
                r_tri_rev ob2 = new r_tri_rev();
                ob2.tri2(n);
                break;
            case 4:
                r_tri_num ob3 = new r_tri_num();
                ob3.tri3(n);
                break;

            default:
                System.out.println("Invalid pattern number.");
                break;
        }

        sc.close();
    }
}
