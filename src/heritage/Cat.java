package heritage;

import java.util.function.Consumer;

public class Cat extends Animal implements MakeNoise {

	@Override
	public void setName(String name) {
		super.setName(name);
	}
	

	public  void getMyNoise() {
		System.out.println("I make noise from my concret class!"+Thread.currentThread());
	}

	
	public  static void main(String args[]) {
	    MakeNoise milou = new Cat();
		milou.getMyNoise();
		Consumer consumer = ( y) -> System.out.print(y);
	}
}
