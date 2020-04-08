package MyBatis.day04.mapper;
import MyBatis.day04.domain.TStudent2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname TStudent2Mapper
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Mapper
public interface TStudent2Mapper {
    @Select("select\n" +
            "st2_id, st2_name, st2_sex\n" +
            "from t_student2 " +
            "where st2_id=#{st2Id}")
    @ResultMap("MyBatis.day04.mapper.TStudent2Mapper.BaseResultMap")
    List<TStudent2> findBySt2Id(@Param("st2Id") Integer st2Id);
}