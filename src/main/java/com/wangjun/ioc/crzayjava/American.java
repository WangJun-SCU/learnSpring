package com.wangjun.ioc.crzayjava;

public class American implements Person {
	
	private Axe axe;
	
	//构造注入所需的带参数的构造器
	public American(Axe axe){
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

}
