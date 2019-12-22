package com.yw.contrlloter;

import com.yw.service.TestFeignService;
import dto.AtfsInquiryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import support.RespResult;

@RestController
public class TestFeignController {

    @Autowired
    private TestFeignService testFeignService;


    @GetMapping("/dal/{memberId}/{pageNo}")
    public RespResult listAtfsInquiry(@PathVariable("memberId") Long memberId, @PathVariable ("pageNo") int pageNo){
        return  testFeignService.listAtfsInquiry(memberId,pageNo );
    }

    @PostMapping("/dal/")
    public RespResult createMember(@RequestBody AtfsInquiryDto atfsInquiryDto){

        return  testFeignService.createMember(atfsInquiryDto );
    }


}
