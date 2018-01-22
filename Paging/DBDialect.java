package org.gtjy.p2p.plugin.Paging;

/**
 * 
 * <p> Title: 数据库类型</p>
 * <p> Description: </p>
 * <p> Copyright: Copyright (c) 2013 </p>
 * <p> Company:吴yuan小森森 https://www.jianshu.com/u/52d72cacb93e </p>
 *
 * @author wys
 * @version 1.0
 */
public abstract class DBDialect {
	
	public abstract String getLimitStr(String sql,int start,int limit);
	
	public static enum Type{
		MYSQL,ORACLE,SQLSERVER;
	}
}
