package com.wwq.ibatis.utils;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class GetSqlMapClient {
	public static SqlMapClient getSapMapClient(){
		SqlMapClient client;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			client=SqlMapClientBuilder.buildSqlMapClient(reader);
			return client;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
