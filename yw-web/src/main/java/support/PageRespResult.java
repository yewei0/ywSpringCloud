/**
 * 
 */
package support;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lifei
 *
 */
@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@ApiModel("分页查询数据模型")
public class PageRespResult extends RespResult<PageList> {/**
	 * 
	 */
	private static final long serialVersionUID = -9048911267043196930L;
	@ApiModelProperty("本次查询的总条数")
	private int totalSize = 0;
	/**
	 * @param code
	 * @param message
	 * @param result
	 */
	public PageRespResult(int code, String message, PageList result) {
		super(code, message, result);
		this.totalSize = result.getTotalSize();
	}
	
	@Override
	public PageRespResult result(PageList result) {
		super.setResult(result);
		this.totalSize = result.getTotalSize();
		return this;
	}
	
}
