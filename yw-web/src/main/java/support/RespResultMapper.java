/**
 * 
 */
package support;

import org.apache.commons.lang.StringUtils;

/**
 * @author lifei
 *
 */
public class RespResultMapper {

	private RespResultMapper() {
	}

	/**
	 * Wrap.
	 *
	 * @param <E>     the element type
	 * @param code    the code
	 * @param message the message
	 * @param o       the o
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> wrap(int code, String message, E o) {
		return new RespResult<>(code, message, o);
	}

	public static PageRespResult wrap(int code, String message, PageList o) {
		return new PageRespResult(code, message, o);
	}

	/**
	 * Wrap.
	 *
	 * @param <E>     the element type
	 * @param code    the code
	 * @param message the message
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> wrap(int code, String message) {
		return new RespResult<>(code, message, null);
	}

	/**
	 * Wrap.
	 *
	 * @param <E>  the element type
	 * @param code the code
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> wrap(int code) {
		return wrap(code, null);
	}

	/**
	 * Wrap.
	 *
	 * @param <E> the element type
	 * @param e   the e
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> wrap(Exception e) {
		return new RespResult<>(RespResult.ERROR_CODE, e.getMessage());
	}

	/**
	 * Un wrapper.
	 *
	 * @param <E>     the element type
	 * @param wrapper the wrapper
	 *
	 * @return the e
	 */
	public static <E> E unWrap(RespResult<E> wrapper) {
		return wrapper.getResult();
	}

	/**
	 * Wrap ERROR. code=100
	 *
	 * @param <E> the element type
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> illegalArgument() {
		return wrap(RespResult.ILLEGAL_ARGUMENT_CODE_, RespResult.ILLEGAL_ARGUMENT_MESSAGE);
	}

	/**
	 * Wrap ERROR. code=500
	 *
	 * @param <E> the element type
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> error() {
		return wrap(RespResult.ERROR_CODE, RespResult.ERROR_MESSAGE);
	}

	/**
	 * Error wrapper.
	 *
	 * @param <E>     the type parameter
	 * @param message the message
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> error(String message) {
		return wrap(RespResult.ERROR_CODE, StringUtils.isBlank(message) ? RespResult.ERROR_MESSAGE : message);
	}

	/**
	 * Wrap SUCCESS. code=200
	 *
	 * @param <E> the element type
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> ok() {
		return new RespResult<>();
	}

	/**
	 * Ok wrapper.
	 *
	 * @param <E> the type parameter
	 * @param o   the o
	 *
	 * @return the wrapper
	 */
	public static <E> RespResult<E> ok(E o) {
		return new RespResult<>(RespResult.SUCCESS_CODE, RespResult.SUCCESS_MESSAGE, o);
	}
}
