public class Leet48Git {
    public static void main(String[] args) {
        Solution48 obj = new Solution48();
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        obj.rotate(a);
    }
}
class Solution48 {

    // [[1,2,3],[4,5,6],[7,8,9]]

    // [[7,4,1],[8,5,2],[9,6,3]]

    public void rotate(int[][] matrix) {

        // System.out.println(matrix.length);
        // System.out.println(matrix[1].length);

        int a[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                matrix[i][j] = a[a.length - (j + 1)][i];
            }
        }

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
