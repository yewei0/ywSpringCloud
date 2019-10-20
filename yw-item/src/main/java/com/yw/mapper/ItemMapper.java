package com.yw.mapper;

import com.yw.dao.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/18 22:51
 */
@Mapper
public interface ItemMapper {
    @Select("select * from tb_item where id =#{id}")
    List<Item> getItems(Long id);

    int addItem(Item item);
}
