23) //patternnumber program
  public class Pattern {
    public static void main(String[] args) {
        int n = 3; 
        int size = n * 2 + 1; 

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int minDist = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                matrix[i][j] = n - minDist + 1;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
