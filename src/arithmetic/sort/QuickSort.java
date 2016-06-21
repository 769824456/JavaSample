package arithmetic.sort;

/**
 * Created by yulongsun on 2016/6/21.
 * 快速排序
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] list = {8, 1, 0, 4, 5, 2, 7, 9, 5, 3};
        quickSort(list, 0, list.length - 1);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }


    public static void quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            quickSort(list, low, middle - 1);
            quickSort(list, middle + 1, high);
        }

    }

    private static int getMiddle(int[] list, int low, int high) {
        int temp = list[low];
        while (low < high) {
            while (low < high && list[high] >= temp) {
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] <= temp) {
                low++;
            }
            list[high] = list[low];
        }
        list[low] = temp;
        return low;
    }
}
