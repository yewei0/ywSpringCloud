package com.yw.itemconllorter;

import com.yw.dao.Item;
import com.yw.service.ItemService;
import com.yw.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品列表
 * @Author: yewei
 * @Date: 2019/10/18 22:47
 */
@Api(description = "商品类")
@RestController
public class ItemConllorter {
    @Autowired
    private ItemService itemService;

    /**
     * 查询商品列表
     * @param id
     * @return
     */
    @ApiOperation("/查询商品")
    @GetMapping("/{id}")
    public JsonResult<List<Item>> getItems( @ApiParam(name = "id",value = "id",required = true)@PathVariable Long id){
            List<Item> items  = itemService.getItems(id);
            return JsonResult.ok(items).msg("获取商品成功");
    }
    /**添加商品*/
    @PostMapping("/add")
    public JsonResult addItem(@RequestBody Item item ){
        int rows =itemService.addItem(item);
        if (rows<=0){
            return  JsonResult.err("商品添加错误");
        }else {
            return JsonResult.ok("添加成功");
        }
    }
    /**根据id修改商品*/


}
