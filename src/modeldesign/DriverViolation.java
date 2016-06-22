package modeldesign;

import java.sql.Time;
import java.util.List;

/**
 * Created by yulongsun on 2016/4/21.
 */
public class DriverViolation {
    //    违章种类	分为超速违章和违法违章
    private int            violateKind;
    //    违章司机工号	显示集团工号和内部工号
    private long           driverId;
    //    违章司机姓名
    private String         driverName;
    //    违章发生时间	 标准为xxxx-xx-xx xx-xx-xx
    private Time           violateTime;
    //    录入时间	 标准为xxxx-xx-xx xx-xx-xx
    private Time           inputTime;
    //    录入人	姓名
    private String         inputer;
    //    所属线路	线路名称
    private String         roadName;
    //    所属车队	车队名称
    private String         cardGroupId;
    //    车号
    private long           cardId;
    //    违章类型	按所扣分值对违章条款分类，此处显示违章条款简称（分值）
    private int            violateType;
    //    违章描述	对本次违章简单描述：路口类型，时间段，路段地点
    private String         violateDesc;
    //    违章捕获类型	分为3种：交警部门，自查<客运安全科查，车队查>，集团公司查
    private int            violateCaptureType;
    //    检查人	姓名，允许输入多人
    private List<Operator> operators;
    //    违章考核	考核形式有4种:记分、考核、记分且考核、教育。记分指扣分、考核指扣钱，教育不扣分也不扣钱。
    private int            violateCheck;
}
