/**  
 * 
 * @author yewwi  
 * @date 2019年11月4日  
 */  
package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 *询价单信息
 * @author yewei
 * @date 2019年11月4日 
 */

@Data
@ApiModel(value="询价单信息", description="询价基本信息")
public class AtfsInquiryDto extends BaseDto<AtfsInquiry> implements Serializable{/**
 * @Fields field:field:{todo}  
 */ 
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="业务类型", allowEmptyValue=true)
	private String inOut;

	@ApiModelProperty(value="运输方式名称", allowEmptyValue=true)
	private String transp;

	@ApiModelProperty(value="成交方式名称", allowEmptyValue=true)
	private String tradeType;

	@ApiModelProperty(value="启运港名称", allowEmptyValue=true)
	private String loading;


	@ApiModelProperty(value="目的港名称", allowEmptyValue=true)
	private String discharge;

	@ApiModelProperty(value = "包装,品名,件数,重量,尺寸，货值",allowEmptyValue = true)
	private List<AtfsInquiryGoods> atfsInquiryGoods ;

	@ApiModelProperty(value = "询价单服务项",allowEmptyValue = true)
	private List<AtfsInquiryServices> atfsInquiryServices ;

	@ApiModelProperty(value = "集装箱信息",allowEmptyValue = true)
	private List<AtfsInquiryContainer> atfsInquiryContainer ; 

	@ApiModelProperty(value="运输要求", allowEmptyValue=true)
	private List<String > transpAskId;
	
    @ApiModelProperty(value="支付方式", allowEmptyValue=true)
    private List<String> payType;

	@ApiModelProperty(value="送货上门地址", allowEmptyValue=true)
	private String deliveryAddr;

	@ApiModelProperty(value="送货上门联系人", allowEmptyValue=true)
	private String deliveryCon;

	@ApiModelProperty(value="送货上门电话", allowEmptyValue=true)
	private String deliveryTel;

	@ApiModelProperty(value="收货地址", allowEmptyValue=true)
	private String harvestAddr;

	@ApiModelProperty(value="收货联系人", allowEmptyValue=true)
	private String harvestCon;

	@ApiModelProperty(value="收货电话", allowEmptyValue=true)
	private String harvestTel;

	@ApiModelProperty(value="发货地址", allowEmptyValue=true)
	private String sendAddr;

	@ApiModelProperty(value="发货联系人", allowEmptyValue=true)
	private String sendCon;

	@ApiModelProperty(value="发货电话", allowEmptyValue=true)
	private String sendTel;
	@ApiModelProperty(value="提货联系人", allowEmptyValue=true)
	private String tabkeCon;

	@ApiModelProperty(value="提货电话", allowEmptyValue=true)
	private String tabkeTel;

	@ApiModelProperty(value="提货地址", allowEmptyValue=true)
	private String takeAddr;

	@ApiModelProperty(value="MARK要求", allowEmptyValue=true)
	private List<String > mark;

	@ApiModelProperty(value="服务偏好", allowEmptyValue=true)
	private List<String> serverPrefer;

	@ApiModelProperty(value="企业ID", allowEmptyValue=true)
	private Long memberId;

	@ApiModelProperty(value="询价企业", allowEmptyValue=true)
	private String memberName;

	@ApiModelProperty(value="创建人", allowEmptyValue=true)
	private Long createBy;
}
