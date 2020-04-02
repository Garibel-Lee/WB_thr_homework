package MyBatis.day02.mapper;

import MyBatis.day02.domain.Card;

/**
 * @author 13059
 * @Classname CardMapper
 * @Description TODO
 * @Date 2020/4/3 2:28
 * @Created by 13059
 */
public interface CardMapper {
    Card queryById(Integer id);
}
