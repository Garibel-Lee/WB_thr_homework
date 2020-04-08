package MyBatis.day03.mapper;
import MyBatis.day03.domain.TStudent2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname TStudent2Mapper
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Mapper
public interface TStudent2Mapper {
    List<TStudent2> findBySt2Id(@Param("st2Id")Integer st2Id);
}