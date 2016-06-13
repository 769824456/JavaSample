package arithmetic.x2;

/**
 * 之字形打印矩阵
 * 对于一个矩阵，请设计一个算法，将元素按“之”字形打印。具体见样例。
 * 给定一个整数矩阵mat，以及他的维数nxm，请返回一个数组，其中元素依次为打印的数字。
 * 测试样例：
 * [[1,2,3],[4,5,6],[7,8,9],[10,11,12]],4,3
 * 返回：[1,2,3,6,5,4,7,8,9,12,11,10]
 */
public class Printer {
    public static int[] printMatrix(int[][] mat, int n, int m) {
        int[] reslut = new int[n * m];
        int   index  = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {//偶数
                for (int j = 0; j < m; j++) {
                    reslut[index] = mat[i][j];
                    index++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    reslut[index] = mat[i][j];
                    index++;
                }
            }
        }

        return reslut;
    }


    public static void main(String args[]) {
        int[][] ints = new int[4][3];
        int     tag  = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                tag++;
                ints[i][j] = tag;
                if (j != 2) {
                    System.out.print(ints[i][j] + ",");
                } else {
                    System.out.print(ints[i][j]);
                }
            }
            System.out.print("]");
        }
        System.out.println();
        int[] reslut = printMatrix(ints, 4, 3);
        for (int i = 0; i < reslut.length; i++) {
            System.out.print(reslut[i]+",");
        }
    }
}