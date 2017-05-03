package com.lyx.ag.power.lb.strategy;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.lyx.ag.power.lb.AbstractLoadBalance;
import com.lyx.ag.power.lb.annotation.LBS;

/**
 * 
 * @author liyixiang
 * @date 2017年5月3日
 * @use 轮询
 */
@LBS(name="RoundRobin")
public class RoundRobinLoadBalance extends AbstractLoadBalance{

/*
//start singleTon	
	private RoundRobinLoadBalance(){}
	
	private static class Build {
		
		private static final RoundRobinLoadBalance rr = new RoundRobinLoadBalance();
		
		static LoadBalance build(){
			return rr;
		}
	}
	
	public static LoadBalance getInstance(){
		return Build.build();
	}
//end singleTon	
 * 
 */
	
	private static AtomicLong atomicLong = new AtomicLong(0);
	
	@Override
	public <T> T doSelect(List<T> list) {
		// TODO Auto-generated method stub
		long index = atomicLong.getAndIncrement();
		return list.get((int)(index%list.size()));
	}

}
