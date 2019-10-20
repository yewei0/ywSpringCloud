package com.yw.dao;

import java.util.Date;


import lombok.Data;
import lombok.experimental.Accessors;
/**
 * @author MyPC
 */
@Data
@Accessors(chain = true)
public class Cart extends BasePojo{
	private Long id;
	private Long userId;
	private Long itemId;
	private String itemTitle;
	private String itemImage;
	private Long itemPrice;
	private Integer num;

}
