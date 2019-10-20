package com.yw.dao;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ItemDesc extends BasePojo{
	//item表id与itemDesc表Id一致的
	private Long itemId;
	private String itemDesc;//商品详情信息
}
