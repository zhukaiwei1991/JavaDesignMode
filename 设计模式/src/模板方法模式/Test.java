package 模板方法模式;

public class Test {

	public static void main(String[] args) {
		AbstractClass c;
		c = new ConcreteClassA();
		c.templateMethod();
		
		c = new ConcreteClassB();
		c.templateMethod();
		
		System.out.println("结束！");
	}
	
}
