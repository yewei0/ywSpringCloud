package com.yw.contrlloter;

import com.yw.dao.Item;
import com.yw.service.ItemFeignSerivce;
import com.yw.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/20 22:28
 */
@RestController
public class ItemfeignController {
    @Autowired
    private ItemFeignSerivce itemFeignSerivce;
    @GetMapping("/{id}")
    public JsonResult<List<Item>> getItem(@PathVariable Long id){
        return  itemFeignSerivce.getItem(id);
    }
}
