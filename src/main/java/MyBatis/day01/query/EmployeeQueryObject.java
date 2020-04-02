package MyBatis.day01.query;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter@Getter
public class EmployeeQueryObject {
		
		private String keyword;
		private BigDecimal minSalary;
		private BigDecimal maxSalary;
		private Long deptId=-1L;
		
		
		public String getKeyword() {
			
			return  empty2null(keyword);
		}
		
		private String empty2null(String str){
			return  hasLenght(str)?str:null;	
		}

		private boolean hasLenght(String str) {
			
			return str!=null && !"".equals(str.trim());
		}
}
