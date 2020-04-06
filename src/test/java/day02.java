import MyBatis.day02.domain.Reader;
import MyBatis.day02.mapper.ReaderMapper;
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
public class day02 {
    @Test
    /*多对一的实体关系维护 采用额外交给框架的额外SQL查询*/
    public void test1(){
        SqlSession session= MybatisUtil.getSession();
        ReaderMapper readerMapper=session.getMapper(ReaderMapper.class);

        List<Reader>  list=readerMapper.queryForList();
        for (Reader reader : list) {
            System.out.println(reader);
        }

    }
}
