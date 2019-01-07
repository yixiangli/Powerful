package com.lyx.ag.business.operator;

/**
 * 
 * @author liyixiang
 * @date 2017年3月20日
 * @use
 * 		操作枚举
 * 
 * 业务相关操作：
 * 		一般系统进行了数据更新（如新增／修改／删除），都需要对下游发送通知
 * 
 */
public enum Operator {

	/**
	 * 新增
	 */
	ADD, 
	
	/**
	 * 更新
	 */
	UPDATE,
	
	/**
	 * 删除
	 */
	DELETE, 
}
