package com.lyx.ag.power.lb;

import java.util.List;

/**
 * 
 * @author liyixiang
 * @date 2017年3月29日
 * @use
 * 		负载均衡
 */
public interface LoadBalance {

	/**
	 * 负载均衡策略选取
	 * @param list 负载均衡列表
	 * @return
	 */
	<T> T select(List<T> list);
}
