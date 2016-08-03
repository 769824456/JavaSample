package arithmetic.排序.插入排序.直接插入排序;

import org.junit.Test;

/**
 * PACKAGE_NAME: arithmetic
 * USER : yulongsun
 * DATE : 2016/6/17
 * VERSION : 1.0
 * DESC :直接插入排序
 */
public class StraightInsertionSort {


    @Test
    public void testInsert() {
        int[] arr    = {7, 1, 2, 3, 5, 4, 6, 8};
        int[] result = straightInsertSort(arr);

        for (int x : result) {
            System.out.print(x + "\t");
        }
    }


    /*直接插入排序*/
    public int[] straightInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j   = i - 1;
            while ((j >= 0) && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tmp;
        }
        return arr;
    }
}
