public class decreasingColumnNoWithRows {
    public static void main(String[] args) {
        
        int n=5;

        for(int i=0; i<n; i++) 
        // for(int i=1; i<=n; i++) 
        {
            for(int j=1; j<=n-i; j++) 
            // for(int j=1; j<=n-i+1; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}
