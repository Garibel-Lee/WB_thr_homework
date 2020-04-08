package MyBatis.day03.mapper;

import MyBatis.day03.domain.TStudent;

/**
 * @Classname TStudentMapper
 * @Description TODO
 * @Date 2020/4/6 21:17
 * @Created by LCQJOYCE
 */
public interface TStudentMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    TStudent selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);

    TStudent  getStuAndTBankCards(Integer stId);
}