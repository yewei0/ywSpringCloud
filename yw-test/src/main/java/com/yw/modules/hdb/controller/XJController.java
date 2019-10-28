package com.yw.modules.hdb.controller;

import com.yw.modules.hdb.entity.InquirySheetEntity;
import com.yw.service.XJService;
import com.yw.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 询价接口
 * @Author: yewei
 * @Date: 2019/10/27 18:02
 */
@RestController
@RequestMapping("/xj")
public class XJController {
    @Autowired
    private XJService xjService;
    @RequestMapping("/queryInquirySheets/{inquiryStatus}/{transportModeId}/{inOut}")
    public JsonResult<List<InquirySheetEntity>>  queryInquirySheets(@PathVariable("inquiryStatus") String inquiryStatus,
                                                                    @PathVariable("transportModeId") String transportModeId ,
                                                                    @PathVariable("inOut") String inOut){
        List<InquirySheetEntity> list =xjService.findall( inquiryStatus,transportModeId,inOut);
        return JsonResult.ok(list).msg("OK");
    }
}
