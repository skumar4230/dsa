public class Main {
    public static void main(String[] args) {
       int matrix[][] = {{54,4554,5,54,45,54,6},{56,47,69,55,56,47,55}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}