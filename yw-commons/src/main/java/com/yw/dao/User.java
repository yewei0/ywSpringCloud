package com.yw.dao;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User extends BasePojo{
	private Long   id;
	private String username;
	private String password;
	private String phone;
	private String email;
	
}
