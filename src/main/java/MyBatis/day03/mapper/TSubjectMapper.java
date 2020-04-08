package MyBatis.day03.mapper;
import MyBatis.day03.domain.TSubject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname TSubjectMapper
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Mapper
public interface TSubjectMapper {

    List<TSubject> findBySubId(@Param("subId")Integer subId);

    List<TSubject> SfindBySubId(@Param("subId")Integer subId);
}