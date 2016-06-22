package test;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by yulongsun on 2016/4/28.
 */
public class Test {
    public static void main(String[] args) {
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
////        long time = timestamp.getTime();
//        String time = simpleDateFormat.format(timestamp);
//        System.out.println(time);


        String deStr = "0123abcdABCDE";
        byte[] bytes = deStr.getBytes();
        int numCount = 0;
        int daXieCount = 0;
        int xiaoXieCount = 0;
        for (byte b : bytes) {
            if (b >= 'A' && b <= 'Z') {
                daXieCount++;
            } else if (b >= 'a' && b <= 'z') {
                xiaoXieCount++;
            } else if (b >= '0' && b <= '9') {
                numCount++;
            }
        }
        System.out.println("numCount=" + numCount);
        System.out.println("daXieCount=" + daXieCount);
        System.out.println("xiaoXieCount=" + xiaoXieCount);
    }
}
