package MyBatis.day04.mapper;

import MyBatis.day04.domain.TSubject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname TSubjectMapper
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Mapper
public interface TSubjectMapper {
    @Select("    select\n" +
            "    sub_id, sub_name, sub_cent\n" +
            "    from t_subject\n" +
            "    where sub_id=#{subId,jdbcType=INTEGER}")
    @ResultMap("MyBatis.day04.mapper.TSubjectMapper.BaseResultMap")
    List<TSubject> findBySubId(@Param("subId") Integer subId);

    @Select("    select\n" +
            "    sub_id, sub_name, sub_cent\n" +
            "    from t_subject\n" +
            "    where sub_id=#{subId,jdbcType=INTEGER}")
    @ResultMap("MyBatis.day04.mapper.TSubjectMapper.BaseResultMap2")
    List<TSubject> SfindBySubId(@Param("subId") Integer subId);
}