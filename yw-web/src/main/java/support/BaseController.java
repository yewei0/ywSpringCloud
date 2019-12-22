/**
 * 
 */
package support;


/**
 * @author lifei
 *
 */
public class BaseController {

	/**
	 * Handle result wrapper.
	 *
	 * @param <T>    the type parameter
	 * @param result the result
	 *
	 * @return the wrapper
	 */
	protected <T> RespResult<T> handleResult(T result) {
		boolean flag = isFlag(result);

		if (flag) {
			return RespResultMapper.wrap(RespResult.SUCCESS_CODE, "操作成功", result);
		} else {
			return RespResultMapper.wrap(RespResult.ERROR_CODE, "操作失败", result);
		}
	}
	protected PageRespResult handleResult(PageList result) {
		boolean flag = isFlag(result);
		if (flag) {
			return RespResultMapper.wrap(RespResult.SUCCESS_CODE, "操作成功", result);
		} else {
			return RespResultMapper.wrap(RespResult.ERROR_CODE, "操作失败", result);
		}
	}
	/**
	 * Handle result wrapper.
	 *
	 * @param <E>      the type parameter
	 * @param result   the result
	 * @param errorMsg the error msg
	 *
	 * @return the wrapper
	 */
	protected <E> RespResult<E> handleResult(E result, String errorMsg) {
		boolean flag = isFlag(result);

		if (flag) {
			return RespResultMapper.wrap(RespResult.SUCCESS_CODE, "操作成功", result);
		} else {
			return RespResultMapper.wrap(RespResult.ERROR_CODE, errorMsg, result);
		}
	}
	
	protected RespResult handleOK(){
		return RespResultMapper.ok();
	}
	
	protected RespResult handleFail(Exception ex) {
		ex.printStackTrace(System.err);
		return RespResultMapper.error(ex.getMessage());
	}
	
	private boolean isFlag(Object result) {
		boolean flag;
		if (result instanceof Integer) {
			flag = (Integer) result > 0;
		} else if (result instanceof Boolean) {
			flag = (Boolean) result;
		} else {
			flag = result!=null;
		}
		return flag;
	}
}
