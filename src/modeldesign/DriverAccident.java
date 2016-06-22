package modeldesign;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * Created by yulongsun on 2016/4/21.
 */
public class DriverAccident {
    //    所属车队	车队名称
    private long           carGroupId;
    //    事故司机工号	显示集团工号和内部工号
    private long           driverId;
    //    事故司机姓名
    private long           driverName;
    //    所属线路	线路名称
    private String         roadName;
    //    车号
    private String         carId;
    //    发生日期	 标准为xxxx-xx-xx
    private Date           happenDate;
    //    事故发生时间	标准为xx-xx-xx
    private String         happenTime;
    //    事故地点	建议数字化表示
    private String         happenAddr;
    //    事故场景	事故线路类型（市区，郊区等）；路口；天气；事故责任程度（全责事故，同等，主次责任，第三方责任事故）；事故程度（一般分4种）；事故双方类型（车辆对车辆，车辆对行人，车辆自身，车辆对非机动车）
    private String         accidentType;
    //    对方信息	对方姓名，对方性别，对方年龄，身份证号码，对方联系地址。
//    private
//    可以多个。
//    事故发生的费用	保险公司支付，对方付<多笔>，己方支付<司机支付｛已支付，未支付｝，公司支付>
//    收入	司机赔款，司机扣款，保险理赔，保险费佣金，司机风险金，其它
//    支出	事故借款，直接事故费，撞坏车修理费，保险费，其它
//    安全员	多个
    private List<Operator> safe;
    //    状态	录入、安全部门审核、分管经理审核、经理审核、结案、借款、财务审核、财务入帐
    private int            status;
}
