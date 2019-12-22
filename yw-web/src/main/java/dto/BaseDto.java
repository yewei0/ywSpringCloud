/**
 * 
 */
package dto;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 基础 DTO 对象
 * @author lifei
 *
 */
public abstract class BaseDto<E> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7545658461350403561L;

	public E to(E entity) {
		BeanUtils.copyProperties(entity, this);
		return entity;
	}
}
