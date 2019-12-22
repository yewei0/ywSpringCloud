package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * AtfsInquiryGoods询价商品
 */
@ApiModel(value="询价商品", description="询价商品")
@Generated("titan.lightbatis.web.generate.LombokBeanSerializer")
@Data
public class AtfsInquiryGoods {

    @ApiModelProperty(value="创建人", allowEmptyValue=true)
    private Long createdBy;

    @ApiModelProperty(value="创建时间", allowEmptyValue=true)
    private java.sql.Timestamp createdTime;

    @ApiModelProperty(value="商品编码", allowEmptyValue=true)
    private String goodsCode;

    @ApiModelProperty(value="商品名称", allowEmptyValue=true)
    private String goodsName;

    @ApiModelProperty(value="ID", allowEmptyValue=true)
    private Long id;

    @ApiModelProperty(value="询价单ID", allowEmptyValue=true)
    private Long inquiryId;

    @ApiModelProperty(value="包装", allowEmptyValue=true)
    private String packing;

    @ApiModelProperty(value="件数", allowEmptyValue=true)
    private Integer qty;

    @ApiModelProperty(value="乐观锁", allowEmptyValue=true)
    private Integer revision;

    @ApiModelProperty(value="排序", allowEmptyValue=true)
    private Integer sortOrder;

    @ApiModelProperty(value="删除", allowEmptyValue=true)
    private Integer status;

    @ApiModelProperty(value="更新人", allowEmptyValue=true)
    private Long updatedBy;

    @ApiModelProperty(value="更新时间", allowEmptyValue=true)
    private java.sql.Timestamp updatedTime;

    @ApiModelProperty(value="货值", allowEmptyValue=true)
    private String usd;

    @ApiModelProperty(value="尺寸", allowEmptyValue=true)
    private String volume;

    @ApiModelProperty(value="重量", allowEmptyValue=true)
    private String weight;

}

