package MyBatis.day03.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname TStudent2
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Setter@Getter
public class TStudent2 implements Serializable {
    /**
    * 主键自增
    */
    private Integer st2Id;

    /**
    * 姓名
    */
    private String st2Name;

    /**
    * 性别
    */
    private String st2Sex;
    /**
     * 成绩单
     */
    private List<TSubject> tSubjects;

    private List<TScore> tScores;

    @Override
    public String toString() {
        return "\nTStudent2{" +
                "st2Id=" + st2Id +
                ", st2Name='" + st2Name + '\'' +
                ", st2Sex='" + st2Sex + '\'' +
                ", tScores=" + tScores +
                '}';
    }
}