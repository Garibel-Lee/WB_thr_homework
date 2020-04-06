import MyBatis.day01.domain.Employee;
import MyBatis.day01.mapper.EmployeeMapper;
import MyBatis.day01.query.EmployeeQueryObject;
import MyBatis.util.MybatisUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class day01 {

	@Test
 	public 	void test() throws Exception {
		EmployeeMapper employeeMapper = MybatisUtil.getMapper(EmployeeMapper.class);
		BigDecimal minSalary = new BigDecimal("1000");
		BigDecimal maxSalary = new BigDecimal("9000");
		List<Employee> es = employeeMapper.query(minSalary, maxSalary, null);
		for (Employee employee : es) {
			System.out.println(employee);
		}
	}

	@Test
	public void test2() throws Exception {
		EmployeeMapper employeeMapper = MybatisUtil.getMapper(EmployeeMapper.class);
		BigDecimal minSalary = new BigDecimal("1000");
		BigDecimal maxSalary = new BigDecimal("9000");
		Long deptId = 222l;
		List<Employee> es = employeeMapper.query(null, null, null);
		for (Employee employee : es) {
			System.out.println(employee);
		}
	}

	@Test
	public void testName() throws Exception {
		EmployeeQueryObject qo = new EmployeeQueryObject();
		EmployeeMapper employeeMapper = MybatisUtil.getMapper(EmployeeMapper.class);
		List<Employee> es = employeeMapper.queryForList(qo);
		for (Employee employee : es) {
			System.out.println(employee);
		}
	}



}
