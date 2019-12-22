package com.yw.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import support.PageObject;
import support.RespResult;
import vo.QueryIquiryVO;

/**
 * @Author: yewei
 * @Date: 2019/12/2 17:49
 */
//@FeignClient(name = "aeotrade-service-atfs")
@Service
public interface AtfsFeignService {

   /* @GetMapping(" /test/inquiry/{memberId}")
    RespResult listAtfsInquiry(@PathVariable Long memberId);

    @GetMapping("/dal/Dict/work")
    RespResult findWorkPlan();*/

}
