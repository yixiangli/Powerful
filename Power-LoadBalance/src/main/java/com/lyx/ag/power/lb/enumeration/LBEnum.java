package com.lyx.ag.power.lb.enumeration;

public enum LBEnum {

	//轮询 Round Robin
	RoundRobin(0,"RoundRobin"),
	//加强轮询 Weight Round Robin
	WeightRoundRobin(1,"WeightRoundRobin"),
	//随机 Random
	Random(2,"Random"),
	//加强随机 Weight Random
	WeightRandom(3,"WeightRandom"),
	//最少连接 Least Connections
	LeastConnections(4,"LeastConnections");
	//加强最少连接
	//源地址散列 Hash

	private Integer index;
	private String name;
	
	LBEnum(Integer index,String name){
		this.index = index;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getIndex() {
		return index;
	}
}
