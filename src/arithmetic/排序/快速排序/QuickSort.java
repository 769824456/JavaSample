package arithmetic.排序.快速排序;

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
            int middle = partition(list, low, high);
            //递归排序
            quickSort(list, low, middle - 1);
            quickSort(list, middle + 1, high);
        }

    }

    /**
     * 分割
     *
     * @param list
     * @param low
     * @param high
     * @return 获取枢轴位置
     */
    private static int partition(int[] list, int low, int high) {
        int pivot = list[low];//枢轴位置
        while (low < high) {
            while (low < high && list[high] >= pivot) {//high指针往low走
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] <= pivot) {//low指针往high走
                low++;
            }
            list[high] = list[low];
        }
        //low==high就是循环停止的位置，也就是枢轴的位置
        list[low] = pivot;
        return low;
    }
}
