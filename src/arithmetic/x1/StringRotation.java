package arithmetic.x1;

/**
 * 字符串的旋转
 * 对于一个字符串，和字符串中的某一位置，请设计一个算法，将包括i位置在内的左侧部分移动到右边，将右侧部分移动到左边。
 * 给定字符串A和它的长度n以及特定位置p，请返回旋转后的结果。
 * 测试样例：
 * "ABCDEFGH",8,4
 * 返回："FGHABCDE"
 */
public class StringRotation {
    public String rotateString(String A, int n, int p) {
        return A.substring(p + 1, n) + A.substring(0, p + 1);
    }

    public static void main(String[] args) {
        StringRotation stringRotation = new StringRotation();
        String         result         = stringRotation.rotateString("ABCDEFGH", 8, 4);
        System.out.println(result);
    }
}