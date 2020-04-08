import MyBatis.day03.domain.TBankCard;
import MyBatis.day03.domain.TStudent;
import MyBatis.day03.domain.TStudent2;
import MyBatis.day03.domain.TSubject;
import MyBatis.day03.mapper.TBankCardMapper;
import MyBatis.day03.mapper.TStudent2Mapper;
import MyBatis.day03.mapper.TStudentMapper;
import MyBatis.day03.mapper.TSubjectMapper;
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
public class day03 {
    @Test
    /*一对多的实体关系维护
    *    * 学生  N  查询 到银行卡  1
    * */
    public void test1() {
        SqlSession session = MybatisUtil.getSession();
        TStudentMapper tStudentMapper = session.getMapper(TStudentMapper.class);

        TStudent list = tStudentMapper.getStuAndTBankCards(1);
        System.out.println(list);

    }

    /*一对多的实体关系维护
    *
    * 银行卡  1  查询 到学生  N
    *
    * */
    @Test
    public void test2() {
        SqlSession session = MybatisUtil.getSession();
        TBankCardMapper tBankCardMapper = session.getMapper(TBankCardMapper.class);
        TBankCard list = tBankCardMapper.selectByCardNO("2555150224");
        System.out.println(list);

    }


    /*1对N的实体关系维护
     *
     * 学生 1 查询  多了一个中间表查询  到  课程 N
     *
     * */
    @Test
    public void test3() {
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
    public void test4() {
        SqlSession session = MybatisUtil.getSession();
        TSubjectMapper tSubjectMapper = session.getMapper(TSubjectMapper.class);
        List<TSubject> list =tSubjectMapper.SfindBySubId(5);
        for (TSubject tSubject : list) {
            System.out.println(tSubject.getSubName()+tSubject.getTScores());
        }

    }



}
