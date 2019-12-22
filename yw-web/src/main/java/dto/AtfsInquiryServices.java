package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * AtfsInquiryServices询价单服务项
 */
@ApiModel(value="询价单服务项", description="询价单服务项")
@Generated("titan.lightbatis.web.generate.LombokBeanSerializer")
@Data
public class    AtfsInquiryServices {

    @ApiModelProperty(value="字典", allowEmptyValue=true)
    private Long bizDictId;

    @ApiModelProperty(value="字典项", allowEmptyValue=true)
    private Long bizDictItemId;

    @ApiModelProperty(value="服务名称", allowEmptyValue=true)
    private String bizDictItemName;

    @ApiModelProperty(value="ID", allowEmptyValue=true)
    private Long bizId;

    @ApiModelProperty(value="创建人", allowEmptyValue=true)
    private Long createdBy;

    @ApiModelProperty(value="创建时间", allowEmptyValue=true)
    private java.sql.Timestamp createdTime;

    @ApiModelProperty(value="序号", allowEmptyValue=true)
    private Long id;

    @ApiModelProperty(value="国内/国外", allowEmptyValue=true)
    private Integer inOutType;

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

