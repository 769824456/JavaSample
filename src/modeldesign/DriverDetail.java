package modeldesign;

import java.util.List;

/**
 * Created by yulongsun on 2016/4/21.
 */
public class DriverDetail {
    private long         id;
    private String       name;
    private int          safeKm;//安全公里
    private int          violationScore; //    违章记分	 违章记分达到15分扣3万安全公里
    private List<Driver> master;//    带班师傅	可多个
    private int          tranType;//    培训类别
}
