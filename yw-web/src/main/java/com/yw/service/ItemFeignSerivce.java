package com.yw.service;

import com.yw.dao.Item;
import com.yw.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/20 22:33
 */
@FeignClient("yw-item")
public interface ItemFeignSerivce {
    @GetMapping("/{id}")
     JsonResult<List<Item>> getItem(@PathVariable  Long id);
}
