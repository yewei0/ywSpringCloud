package com.yw.service;

import com.yw.dao.Item;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/18 22:49
 */
public interface ItemService {
    /**
     * 获取商品列表
     * @param id
     * @return
     */
    List<Item> getItems(Long id);

    /**
     * 添加商品
      * @param item
     * @return
     */
    int addItem(Item item);
}
