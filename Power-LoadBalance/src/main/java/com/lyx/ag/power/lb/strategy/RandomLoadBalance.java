package com.lyx.ag.power.lb.strategy;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.lyx.ag.power.lb.AbstractLoadBalance;
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

/*
//start singleTon	
	private RandomLoadBalance(){}
	
	private static class Build {
		
		private static final RandomLoadBalance rd = new RandomLoadBalance();
		
		static LoadBalance build(){
			return rd;
		}
	}
	
	public static LoadBalance getInstance(){
		return Build.build();
	}
//end singleTon	
 * 
 */	
	
	private static final ThreadLocalRandom random = ThreadLocalRandom.current();
	
	@Override
	public <T> T doSelect(List<T> list) {
		// TODO Auto-generated method stub
		int index = random.nextInt(list.size());
		return list.get(index);
	}

}
