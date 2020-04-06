package MyBatis.day02.mapper;

import MyBatis.day02.domain.Reader;

import java.util.List;


/**
 * @author 13059
 */
public interface ReaderMapper {

	List<Reader> queryForList();

	Reader queryById(Integer id);
}
