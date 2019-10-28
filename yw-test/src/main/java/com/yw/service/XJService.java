package com.yw.service;

import com.yw.modules.hdb.entity.InquirySheetEntity;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/27 18:04
 */
public interface XJService {

    List<InquirySheetEntity> findall(String inquiryStatus, String transportModeId, String inOut);
}
