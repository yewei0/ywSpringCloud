package com.yw.modules.hdb.dao;

import com.yw.modules.hdb.entity.InquirySheetEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yewei
 * @Date: 2019/10/27 18:05
 */
@Mapper
public interface XJMapper {

    @Select("select * from inquiry_sheet where inquiry_status=#{inquiryStatus} and transport_mode_id=#{transportModeId} and in_out=#{inOut} order by updated_time desc limit 3 offset 0")
    List<InquirySheetEntity> findall(@Param("inquiryStatus") String inquiryStatus,
                                     @Param("transportModeId") String transportModeId,
                                     @Param("inOut") String inOut);
}
