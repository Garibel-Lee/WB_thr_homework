package MyBatis.day03.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @Classname TStudent
 * @Description TODO
 * @Date 2020/4/6 21:17
 * @Created by LCQJOYCE
 */
@Getter @Setter@ToString
public class TStudent {
    /**
    * 主键自增
    */
    private Integer stId;

    /**
    * 姓名
    */
    private String stName;

    /**
    * 性别
    */
    private String stSex;

    /**
     * CardS
     */
    private List<TBankCard>  cards;


}