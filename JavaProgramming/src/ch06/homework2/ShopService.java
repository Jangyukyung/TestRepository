package ch06.homework2;

public class ShopService {
	private static ShopService singleton=new ShopService();
	
	
	static ShopService getInstance(){
		return singleton;
		
	}
}
