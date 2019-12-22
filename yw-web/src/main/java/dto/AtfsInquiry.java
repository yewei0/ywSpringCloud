package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * AtfsInquiry询价单
 */
@ApiModel(value="询价单", description="询价单")
@Generated("titan.lightbatis.web.generate.LombokBeanSerializer")
@Data
public class AtfsInquiry {

    @ApiModelProperty(value="创建人", allowEmptyValue=true)
    private Long createBy;

    @ApiModelProperty(value="创建时间", allowEmptyValue=true)
    private java.sql.Timestamp createTime;

    @ApiModelProperty(value="送货上门地址", allowEmptyValue=true)
    private String deliveryAddr;

    @ApiModelProperty(value="送货上门联系人", allowEmptyValue=true)
    private String deliveryCon;

    @ApiModelProperty(value="送货上门电话", allowEmptyValue=true)
    private String deliveryTel;

    @ApiModelProperty(value="目的港名称", allowEmptyValue=true)
    private String discharge;

    @ApiModelProperty(value="目的港", allowEmptyValue=true)
    private Long dischargeId;

    @ApiModelProperty(value="收货地址", allowEmptyValue=true)
    private String harvestAddr;

    @ApiModelProperty(value="收货联系人", allowEmptyValue=true)
    private String harvestCon;

    @ApiModelProperty(value="收货电话", allowEmptyValue=true)
    private String harvestTel;

    @ApiModelProperty(value="序号", allowEmptyValue=true)
    private Long id;

    @ApiModelProperty(value="业务类型", allowEmptyValue=true)
    private String inOut;

    @ApiModelProperty(value="业务类型ID", allowEmptyValue=true)
    private Long inOutId;

    @ApiModelProperty(value="询价状态", allowEmptyValue=true)
    private String inqueryStatus;

    @ApiModelProperty(value="询价单号", allowEmptyValue=true)
    private String inquiryNo;

    @ApiModelProperty(value="启运港名称", allowEmptyValue=true)
    private String loading;

    @ApiModelProperty(value="启运港", allowEmptyValue=true)
    private Long loadingId;

    @ApiModelProperty(value="MARK要求", allowEmptyValue=true)
    private String mark;

    @ApiModelProperty(value="企业ID", allowEmptyValue=true)
    private Long memberId;

    @ApiModelProperty(value="询价企业", allowEmptyValue=true)
    private String memberName;

    @ApiModelProperty(value="包装方式名称", allowEmptyValue=true)
    private String packaging;

    @ApiModelProperty(value="包装方式", allowEmptyValue=true)
    private Long packagingId;

    @ApiModelProperty(value="支付方式", allowEmptyValue=true)
    private String payWay;

    @ApiModelProperty(value="乐观锁", allowEmptyValue=true)
    private Integer revision;

    @ApiModelProperty(value="发货地址", allowEmptyValue=true)
    private String sendAddr;

    @ApiModelProperty(value="发货联系人", allowEmptyValue=true)
    private String sendCon;

    @ApiModelProperty(value="发货电话", allowEmptyValue=true)
    private String sendTel;

    @ApiModelProperty(value="服务偏好", allowEmptyValue=true)
    private String serverPrefer;

    @ApiModelProperty(value="询价单企业", allowEmptyValue=true)
    private String sheetMem;

    @ApiModelProperty(value="询价单企业ID", allowEmptyValue=true)
    private Long sheetMemId;

    @ApiModelProperty(value="操作员", allowEmptyValue=true)
    private Long staffId;

    @ApiModelProperty(value="数据状态", allowEmptyValue=true)
    private Integer status;

    @ApiModelProperty(value="提货联系人", allowEmptyValue=true)
    private String tabkeCon;

    @ApiModelProperty(value="提货电话", allowEmptyValue=true)
    private String tabkeTel;

    @ApiModelProperty(value="提货地址", allowEmptyValue=true)
    private String takeAddr;

    @ApiModelProperty(value="成交方式名称", allowEmptyValue=true)
    private String tradeType;

    @ApiModelProperty(value="成交方式", allowEmptyValue=true)
    private Long tradeTypeId;

    @ApiModelProperty(value="运输方式名称", allowEmptyValue=true)
    private String transp;

    @ApiModelProperty(value="运输要求", allowEmptyValue=true)
    private String transpAskId;

    @ApiModelProperty(value="运输方式", allowEmptyValue=true)
    private Long transpId;

    @ApiModelProperty(value="更新人", allowEmptyValue=true)
    private Long updateBy;

    @ApiModelProperty(value="更新时间", allowEmptyValue=true)
    private java.sql.Timestamp updateTime;

}

