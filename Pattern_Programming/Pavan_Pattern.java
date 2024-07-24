public class Pavan_Pattern {
    public static void main(String[] args) {
        int n = 11;
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            // P
            for(int j = 0; j < n; j++)
            {
                if (j == n/4 && i <=(n-1) ||
                    i==0 && j > n/4 && j < (3*n)/4 ||
                    j== (3 * n)/4 && i < (n-1)/2 && i>0 ||
                    i==(n-1)/2 && j>n/4 && j < (3*n)/4) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            // // A
            for(int j = 0; j < n; j++)
            {
                if ( i== 0 && j>=n/4 && j< (3*n)/4 ||
                    j==0 && i >0 ||
                    i== (n-1)/2 && j >= n/4 && j< (3*n)/4 ||
                    j == (3 *n)/4 && i > 0) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            // // V
            for(int j = 0; j < n; j++)
            {
                if (j == 0 && i < (n-1)/2 || 
                    j==n-1 && i < (n-1)/2 ||
                    i-j == (n-1)/2 || i+j == (n-1) + ((n-1)/2)) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");//for the space between V and A
            System.out.print(" ");//for the space between V and A
            
            // // A
            for(int j = 0; j < n; j++)
            {
                if ( i== 0 && j>=n/4 && j< (3*n)/4 ||
                    j==0 && i >0 ||
                    i== (n-1)/2 && j >= n/4 && j< (3*n)/4 ||
                    j == (3 *n)/4 && i > 0) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            // //N
            for(int j = 0; j < n; j++)
            {
                if (j== 0  || i==j || j==n-1) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
