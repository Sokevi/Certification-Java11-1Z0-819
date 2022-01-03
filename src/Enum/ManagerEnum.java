package Enum;

public class ManagerEnum {
	private  String name;
	public static void main(String[] args) {

		Season summer = Season.SUMER;
		

		
		Season spring = Season.valueOf("spring");
		
		System.out.println(spring + " "+ spring.ordinal());
		
		SeasonWithDescribe seasonWithDescribe = SeasonWithDescribe.PRINTER;
		System.out.println(seasonWithDescribe);
		System.out.println(seasonWithDescribe.ordinal());
		seasonWithDescribe.getDescription();
	}

}