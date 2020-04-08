import MyBatis.day04.domain.TStudent2;
import MyBatis.day04.domain.TSubject;
import MyBatis.day04.mapper.TStudent2Mapper;
import MyBatis.day04.mapper.TSubjectMapper;
import MyBatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname day02
 * @Description TODO
 * @Date 2020/4/3 2:26
 * @Created by 13059
 */
public class day04 {



    /*1对N的实体关系维护
     *
     * 学生 1 查询  多了一个中间表查询  到  课程 N
     *
     * */
    @Test
    public void test1() {
        SqlSession session = MybatisUtil.getSession();
        TStudent2Mapper tStudent2Mapper = session.getMapper(TStudent2Mapper.class);
        List<TStudent2> list = tStudent2Mapper.findBySt2Id(1);
        System.out.println(list);

    }





    /*1对N的实体关系维护
     *
     * 课程  1  查询  多了一个中间表查询  到  学生 N
     *
     * 由于做了实体维护可以在查询中间表的时候
     *
     * */
    @Test
    public void test2() {
        SqlSession session = MybatisUtil.getSession();
        TSubjectMapper tSubjectMapper = session.getMapper(TSubjectMapper.class);
        List<TSubject> list =tSubjectMapper.SfindBySubId(5);
        for (TSubject tSubject : list) {
            System.out.println(tSubject.getSubName()+tSubject.getTScores());
        }

    }



}
