package MyBatis.day04.mapper;

import MyBatis.day04.domain.TScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname TScoreMapper
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Mapper
public interface TScoreMapper {
    @Select("        select\n" +
            "        score_id, score_stu2_id, score_sub_cent, score_cent\n" +
            "        from t_score\n" +
            "        where score_stu2_id=#{scoreStu2Id,jdbcType=INTEGER}")
    @ResultMap("MyBatis.day04.mapper.TScoreMapper.BaseResultMap2")
    List<TScore> findByScoreStu2Id(@Param("scoreStu2Id") Integer scoreStu2Id);

    @Select("        select\n" +
            "        score_id, score_stu2_id, score_sub_cent, score_cent\n" +
            "        from t_score\n" +
            "        where score_sub_cent=#{scoreSubId,jdbcType=INTEGER}")
    @ResultMap("MyBatis.day04.mapper.TScoreMapper.BaseResultMap3")

    List<TScore> findByScoreSubId(@Param("scoreSubId") Integer scoreSubId);

}