public class calculation2 {
    public static void main(String[] args) {
        int A[][] = {{5, 3, 1},{4, 2, 6},{8, 5, 7}};
        int B[][] = {{1, 3, 2},{5, 3, 4},{4, 6, 9}};
        int C[][] = new int[3][3]; 
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        } 
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}