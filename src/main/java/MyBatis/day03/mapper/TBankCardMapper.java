package MyBatis.day03.mapper;

import MyBatis.day03.domain.TBankCard;

/**
 * @Classname TBankCardMapper
 * @Description TODO
 * @Date 2020/4/6 21:17
 * @Created by LCQJOYCE
 */
public interface TBankCardMapper {
    int deleteByPrimaryKey(Integer bCardId);

    int insert(TBankCard record);

    int insertSelective(TBankCard record);

    TBankCard selectByStuId(Integer bStuId);

    TBankCard selectByCardNO(String cardNo);

    int updateByPrimaryKeySelective(TBankCard record);

    int updateByPrimaryKey(TBankCard record);
}