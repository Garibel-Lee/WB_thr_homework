package MyBatis.day03.mapper;
import MyBatis.day03.domain.TScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname TScoreMapper
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Mapper
public interface TScoreMapper {

    List<TScore> findByScoreStu2Id(@Param("scoreStu2Id")Integer scoreStu2Id);
    List<TScore> findByScoreSubId(@Param("scoreSubId")Integer scoreSubId);

}