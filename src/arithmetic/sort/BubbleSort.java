package arithmetic.sort;

/**
 * Created by yulongsun on 2016/6/22.
 * 冒泡排序
 * http://blog.csdn.net/amazing7/article/details/51603682
 */
public class BubbleSort {

    /**
     *思路：
     *  1.比较相邻的元素。如果第一个不第二个大，就交换位置。
     *  2.循环执行。
     *
     *
     *性能：
     * 1.最差时间复杂度:O(n^2)
     * 2.最优时间复杂度：O(n)
     * 3.平均时间复杂度：O(n^2)
     */
    public static void main(String[] args) {
        int[] num = {95, 45, 15, 78, 84, 51, 24, 12};
        bubbleSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    private static void bubbleSort(int[] num) {
        int length = num.length;
        int tmp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    tmp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = tmp;
                }
            }
        }
    }


}
