package modeldesign;

import java.util.Date;

/**
 * Created by yulongsun on 2016/4/21.
 */
public class Driver extends Operator {
    private Date   birth;
    private int    gender; //性别
    private String nativePlace;//籍贯
    private String nation;//民族
    private Date   addDate;//进单位时间
    private long   motorcadeId;//车队Id
    private int    eduLevel;//文化程度
    private int    politicalStatus;//政治面貌
    private int    contractPeriod;//合同期限
    private int    professional;//专业技术职称
    private int    property;//用工性质
    private long   cardId;   //身份证号码
    private String addr;//家庭住址
    private String street;//所在街道、社区、派出所
    private int    maritalStatus;//婚姻状况
    private String phone;//固定电话
    private String mobile;//手机全号
    private String virtualNet; //虚拟网
    private long   licenceId;//驾驶证档案编号
    private int    cardType;    //    准驾车型
    private Date   getCardDate;  //    初领证时间	标准为xxxx-xx-xx
    private int    cardCheckMonth; //    驾驶证年审月份	标准为xx
    private String hobby;  //    个人特长爱好
    private int    health;//    健康状况	良好、较好、一般、较差
    private int    hasDisease; //    有无慢性病	有、无
    private int    temper;//    性格脾气	温和、外向、内向、急躁、暴躁、其它
    private int    securityType;//    安全类型	安全型、比较稳定型、不稳定型、不安全型
    private int    dirveResponse; //    驾驶反应	敏捷、比较敏捷、一般、比较迟钝、迟钝
    private int    driveOperate;//    驾驶操作	良好、较好、一般、较差、差
    private String inputer;//    录入人	姓名
    private Date   inputerDate;//    录入时间	 标准为xxxx-xx-xx

}
