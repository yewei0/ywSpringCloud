/**
 * 
 */
package support;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 访问后的统一输出结构
 * @author lifei
 *
 */
@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class RespResult<T> implements Serializable{
	private static final long serialVersionUID = -7101249561955569057L;
	/**
	 * 成功码.
	 */
	public static final int SUCCESS_CODE = 200;
	/**
	 * 成功信息.
	 */
	public static final String SUCCESS_MESSAGE = "操作成功";
	/**
	 * 错误码.
	 */
	public static final int ERROR_CODE = 500;
	/**
	 * 错误信息.
	 */
	public static final String ERROR_MESSAGE = "内部异常";
	/**
	 * 错误码：参数非法
	 */
	public static final int ILLEGAL_ARGUMENT_CODE_ = 400;
	/**
	 * 错误信息：参数非法
	 */
	public static final String ILLEGAL_ARGUMENT_MESSAGE = "参数非法";
	/**
	 * 编号.
	 */
	@ApiModelProperty(value="返回值编码", notes = "200:操作成功; 500: 内部异常; 100:参数非法")
	private int code;
	/**
	 * 信息.
	 */
	@ApiModelProperty("返回值信息")
	private String message;
	/**
	 * 结果数据
	 */
	@ApiModelProperty("本次操作返回的结果数据")
	private T result;
	/**
	 * Instantiates a new wrapper. default code=200
	 */
	RespResult() {
		this(SUCCESS_CODE, SUCCESS_MESSAGE);
	}
	/**
	 * Instantiates a new wrapper.
	 * @param code    the code
	 * @param message the message
	 */
	RespResult(int code, String message) {
		this(code, message, null);
	}
	/**
	 * Instantiates a new wrapper.
	 * @param code    the code
	 * @param message the message
	 * @param result  the result
	 */
	RespResult(int code, String message, T result) {
		super();
		this.code(code).message(message).result(result);
	}
	/**
	 * Sets the 编号 , 返回自身的引用.
	 * @param code the new 编号
	 * @return the wrapper
	 */
	private RespResult<T> code(int code) {
		this.setCode(code);
		return this;
	}

	/**
	 * Sets the 信息 , 返回自身的引用.
	 * @param message the new 信息
	 * @return the wrapper
	 */
	private RespResult<T> message(String message) {
		this.setMessage(message);
		return this;
	}

	/**
	 * Sets the 结果数据 , 返回自身的引用.
	 * @param result the new 结果数据
	 * @return the wrapper
	 */
	public RespResult<T> result(T result) {
		this.setResult(result);
		return this;
	}

	/**
	 * 判断是否成功： 依据 Wrapper.SUCCESS_CODE == this.code
	 * @return code =200,true;否则 false.
	 */
	@JsonIgnore
	public boolean success() {
		return RespResult.SUCCESS_CODE == this.code;
	}

	/**
	 * 判断是否成功： 依据 Wrapper.SUCCESS_CODE != this.code
	 * @return code !=200,true;否则 false.
	 */
	@JsonIgnore
	public boolean error() {
		return !success();
	}
}
