/**  
 * 
 * @author yewwi  
 * @date 2019年11月4日  
 */  
package vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author yewei
 * @date 2019年11月4日 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryIquiryVO {
	@ApiModelProperty(value="创建时间", allowEmptyValue=true)
	private java.sql.Timestamp createTime;

	@ApiModelProperty(value="询价单号", allowEmptyValue=true)
	private String inquiryNo;

	@ApiModelProperty(value="启运港", allowEmptyValue=true)
	private String  loading;

	@ApiModelProperty(value="目的港", allowEmptyValue=true)
	private String  discharge;

	@ApiModelProperty(value="运输方式", allowEmptyValue=true)
	private String  transp;

	@ApiModelProperty(value="业务类型ID", allowEmptyValue=true)
	private String  inOut;

	@ApiModelProperty(value="询价状态", allowEmptyValue=true)
	private String inqueryStatus;
	@ApiModelProperty(value="成交方式", allowEmptyValue=true)
	private String tradeType;
}
