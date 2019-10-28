package com.yw.modules.hdb.service.impl;

import com.yw.modules.hdb.dao.XJMapper;
import com.yw.modules.hdb.entity.InquirySheetEntity;
import com.yw.service.XJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/27 18:04
 */
@Service
public class XJServiceImpl implements XJService {
    @Autowired
    private XJMapper xjMapper;

    @Override
    public List<InquirySheetEntity> findall(String inquiryStatus, String transportModeId, String inOut) {
        return xjMapper.findall(inquiryStatus,transportModeId,inOut);
    }
}
