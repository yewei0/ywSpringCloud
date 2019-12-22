package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * AtfsInquiryContainer询价商品集装箱信息
 */
@ApiModel(value="询价商品集装箱信息", description="询价商品集装箱信息")
@Generated("titan.lightbatis.web.generate.LombokBeanSerializer")
@Data
public class AtfsInquiryContainer {

    @ApiModelProperty(value="集装箱数量", allowEmptyValue=true)
    private Integer containerCount;

    @ApiModelProperty(value="集装箱型号", allowEmptyValue=true)
    private String containerType;

    @ApiModelProperty(value="创建人", allowEmptyValue=true)
    private Long createdBy;

    @ApiModelProperty(value="创建时间", allowEmptyValue=true)
    private java.sql.Timestamp createdTime;

    @ApiModelProperty(value="序号", allowEmptyValue=true)
    private Long id;

    @ApiModelProperty(value="询价单ID", allowEmptyValue=true)
    private Long inquiryId;

    @ApiModelProperty(value="乐观锁", allowEmptyValue=true)
    private Integer revision;

    @ApiModelProperty(value="删除", allowEmptyValue=true)
    private Integer status;

    @ApiModelProperty(value="更新人", allowEmptyValue=true)
    private Long updatedBy;

    @ApiModelProperty(value="更新时间", allowEmptyValue=true)
    private java.sql.Timestamp updatedTime;

}

