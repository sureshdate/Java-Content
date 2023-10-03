package org.study.easy.Phone;

public class IPhone8 implements Phone {

	@Override
	public String processor() {
		
		return "SD835" ;
	}

	@Override
	public String OS() {
		
		return "Android";
	}

	@Override
	public int SpaceInGb() {
		
		return 64;
	}

}
