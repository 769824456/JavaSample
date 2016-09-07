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
        int[] arr = {7, 1, 2, 3, 5, 4, 6, 8};
        int[] result = straightInsertSort(arr);

        for (int x : result) {
            System.out.print(x + "\t");
        }
    }


    /**
     * 直接插入排序
     *
     * 1.思路：a[0,a(i-1)]构成的子序列式排序的，将ai插入到子序列的适当位置，使得插入后的子序列仍是有序的。出入的位置有比较得到。
     * 2.直接插入算法是稳定的；
     *
     */
    public int[] straightInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while ((j >= 0) && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tmp;
        }
        return arr;
    }


    public void starghtInsert(int[] table) {
        for (int i = 0; i < table.length; i++) {

        }
    }
}
