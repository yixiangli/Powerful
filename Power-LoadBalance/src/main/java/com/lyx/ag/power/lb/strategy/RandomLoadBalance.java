package com.lyx.ag.power.lb.strategy;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.lyx.ag.power.lb.AbstractLoadBalance;
import com.lyx.ag.power.lb.LoadBalance;
import com.lyx.ag.power.lb.annotation.LBS;

/**
 * 
 * @author liyixiang
 * @date 2017年3月29日
 * @use
 * 		随机策略
 */
@LBS(name="Random")
public class RandomLoadBalance extends AbstractLoadBalance{

	private static final ThreadLocalRandom random = ThreadLocalRandom.current();
	
	//start -------- 单例 --------
	private RandomLoadBalance(){}
	
	private static class Builder {
		private static final RandomLoadBalance randomLBS = new RandomLoadBalance();
	
		static LoadBalance build(){
			return randomLBS;
		}
	}
	
	public static LoadBalance getInstance(){
		return Builder.build();
	}
	//end -------- 单例 --------
	
	@Override
	public <T> T doSelect(List<T> list) {
		// TODO Auto-generated method stub
		int index = random.nextInt(list.size());
		return list.get(index);
	}

}
