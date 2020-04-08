package MyBatis.day03.domain;

import lombok.Data;

/**
 * @Classname TBankCard
 * @Description TODO
 * @Date 2020/4/6 21:17
 * @Created by LCQJOYCE
 */
@Data
public class TBankCard {
    /**
    * 主键自增
    */
    private Integer bCardId;

    /**
    * 卡号
    */
    private String bCardNo;

    /**
    * 余额
    */
    private Integer bCardMoney;

    /**
    * 学生编号
    */
    private Integer bStuId;
    /**
     * 卡实体维护学生类
     */
    private TStudent tStudent;
}