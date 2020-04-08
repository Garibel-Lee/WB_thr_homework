package MyBatis.day03.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname TScore
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Setter
@Getter
public class TScore implements Serializable {
    /**
    * 主键自增
    */
    private Integer scoreId;

    /**
    * 学生编号
    */
    private Integer scoreStu2Id;

    /**
    * 课程编号
    */
    private Integer scoreSubCent;

    /**
    * 考试成绩
    */
    private Integer scoreCent;

    private List<TSubject> tSubjects;

    private List<TStudent2> tStudent2s;

    @Override
    public String toString() {
        return "\nTScore{" +
                "scoreId=" + scoreId +
                ", scoreStu2Id=" + scoreStu2Id +
                ", scoreSubCent=" + scoreSubCent +
                ", scoreCent=" + scoreCent +
                ", tSubjects=" + tSubjects +
                ", tStudent2s=" + tStudent2s +
                '}';
    }
}