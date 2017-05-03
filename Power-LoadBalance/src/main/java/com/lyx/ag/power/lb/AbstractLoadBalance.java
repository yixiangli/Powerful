package com.lyx.ag.power.lb;

import java.util.List;

/**
 * 
 * @author liyixiang
 * @date 2017年3月29日
 * @use
 * 		负载均衡策略抽象模版
 */
public abstract class AbstractLoadBalance implements LoadBalance {

	@Override
	public <T> T select(List<T> list) {
		// TODO Auto-generated method stub
		//负载均衡列表为空
		if(null == list || list.size() == 0){
			return null;
		}
		//负载均衡列表只有1个
		if(list.size() == 1){
			return list.get(0);
		}
		return doSelect(list);
	}
	//具体负载均衡策略
	public abstract <T> T doSelect(List<T> list);

}
