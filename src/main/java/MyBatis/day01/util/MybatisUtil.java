package MyBatis.day01.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MybatisUtil {
	private static SqlSessionFactory factory = null;
	static {
		try {
			//创建sqlsessionfactory对象
			factory=new SqlSessionFactoryBuilder().build(
					Resources.getResourceAsStream("mybatis-config.xml")
					);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static SqlSession getSession() {
		return factory.openSession();
	}
	public static <T> T getMapper(Class<T> mapperClass){
		return  getSession().getMapper(mapperClass);
	}
}
