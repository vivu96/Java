public class pettren2 {
    public static void main(String[] args) {
        
        int n=15;
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=n; j++) {
                if (i==0 || j==0 || j==n || i==n) {
                System.out.print("*");                    
                }
                else {
                System.out.print(" ");
                }
            }
    System.out.println();
}

    }
}
