package com.yw.service.impl;

import com.yw.dao.Item;
import com.yw.mapper.ItemMapper;
import com.yw.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/18 22:49
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> getItems(Long id) {
        return itemMapper.getItems(id);
    }

    @Override
    public int addItem(Item item) {
        return itemMapper.addItem(item);
    }
}
