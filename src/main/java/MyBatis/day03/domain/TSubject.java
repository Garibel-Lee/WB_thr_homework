package MyBatis.day03.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname TSubject
 * @Description TODO
 * @Date 2020/4/7 0:33
 * @Created by LCQJOYCE
 */
@Setter
@Getter
public class TSubject implements Serializable {
    /**
    * 主键自增
    */
    private Integer subId;

    /**
    * 课程名
    */
    private String subName;

    /**
    * 学分
    */
    private Integer subCent;

    private List<TStudent2> tStudent2s;



    private List<TScore> tScores;

    @Override
    public String toString() {
        return "TSubject{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                ", subCent=" + subCent +
                ", tStudent2s=" + tStudent2s +
                ", tScores=" + tScores +
                '}';
    }
}