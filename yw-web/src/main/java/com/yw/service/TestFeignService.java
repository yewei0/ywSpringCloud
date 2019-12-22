package com.yw.service;

import dto.AtfsInquiryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import support.RespResult;

@FeignClient(name="aeotrade-service-atfs", url="192.168.1.4:8082")
@Service
public interface TestFeignService {

    @GetMapping("/dal/{memberId}/{pageNo}")
    RespResult listAtfsInquiry(@PathVariable("memberId") Long memberId, @PathVariable("pageNo") int pageNo);

    @PostMapping("/dal/")
    RespResult createMember(@RequestBody AtfsInquiryDto atfsInquiryDto);
}
