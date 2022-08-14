public class hollowRhombus {
    public static void main(String[] args) {

        int n=5,spaces;

        for(int i=1; i<=n; i++)
        {
            spaces = n-i;
            for(int s=spaces; s>=1; s--)
            {
                System.out.print("  ");
            }
            
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                System.out.print("* ");

                else
                System.out.print("  ");
            }

            System.out.println();
        }
        
    }
}
