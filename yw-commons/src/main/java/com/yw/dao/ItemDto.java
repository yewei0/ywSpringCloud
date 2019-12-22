package com.yw.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemDto {
	private Long id;		    //定义主键
	private String title;       //标题
	private String sellPoint;	//卖点信息
	private Long   price;		//商品价格 1.dubbo有精度问题 0.88888..+0.1111112=0.9999.... //2.速度  int > long > dubbo 将商品扩大100倍保存

}
