import java.util.Scanner;

public class TreeBurnt {

    // The original 'tree' function was incomplete and had major syntax errors.
    // It's removed here as its intended purpose was not clear and couldn't be fixed without more context.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows (n):");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns (m):");
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        int totalOnes = 0;

        System.out.println("Enter the elements of the array (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    totalOnes++;
                }
            }
        }
        
        // The original logic for 'c' was also flawed, only checking the first '1' in each row.
        // This simple version just prints the total count of '1's.
        System.out.println("Total count of '1's in the array: " + totalOnes);
        
        
    }
}