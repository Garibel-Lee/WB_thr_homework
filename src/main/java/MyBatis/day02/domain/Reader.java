package MyBatis.day02.domain;

import lombok.Data;


@Data
public class Reader {
	private Integer id;
	private String name;
	private String phone;
	private Card  card;


}
