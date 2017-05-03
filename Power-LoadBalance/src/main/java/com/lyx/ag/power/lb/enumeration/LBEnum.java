package com.lyx.ag.power.lb.enumeration;

public enum LBEnum {

	//轮询 Round Robin
	RoundRobin("RoundRobin"),
	//加强轮询 Weight Round Robin
	WeightRoundRobin("WeightRoundRobin"),
	//随机 Random
	Random("Random"),
	//加强随机 Weight Random
	WeightRandom("WeightRandom"),
	//最少连接 Least Connections
	LeastConnections("LeastConnections");
	//加强最少连接
	//源地址散列 Hash
	
	private String name;
	
	LBEnum(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
