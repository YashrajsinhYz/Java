public class solidRhombus {
    public static void main(String[] args) {

        int n=5,spaces,range,sum;

        for(int i=1; i<=n; i++)
        {
            range = ((2*n)-i);
            for(int k=1; k<=range; k++)
            {
                sum = i+k;

                if(sum >= (n+1))
                System.out.print("* ");

                else
                System.out.print("  ");
            }

            // spaces = n-i;
            // for(int s=spaces; s>=1; s--)
            // {
            //     System.out.print("  ");
            // }
            
            // for(int j=1; j<=n ; j++)
            // {
            //     System.out.print("* ");
            // }

            System.out.println();
        }
        
    }
}
