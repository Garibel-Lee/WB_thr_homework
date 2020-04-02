package MyBatis.day01.mapper;

import MyBatis.day01.domain.Employee;
import MyBatis.day01.query.EmployeeQueryObject;
import org.apache.ibatis.annotations.Param;
import java.math.BigDecimal;
import java.util.List;


/**
 * @author 13059
 */
public interface EmployeeMapper {

	List<Employee> queryForList(EmployeeQueryObject qo);
	
	List<Employee> query(
            @Param("minSalary") BigDecimal minSalary,
            @Param("maxSalary") BigDecimal maxSalary,
            @Param("deptId") Long deptId
    );
}
