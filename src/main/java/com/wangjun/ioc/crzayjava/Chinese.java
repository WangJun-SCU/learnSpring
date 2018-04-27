package com.wangjun.ioc.crzayjava;

public class Chinese implements Person {
	
	private Axe axe;
	
	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		//person对象依赖Axe对象
		System.out.println(axe.chop());
	}

}
