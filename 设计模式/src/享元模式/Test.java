package 享元模式;

public class Test {

	public static void main(String[] args) {
		int extrinsicstate = 22;
		
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx = f.getFlyweight("X");
		fx.operation(--extrinsicstate);
		
		Flyweight fy = f.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("Z");
		fz.operation(--extrinsicstate);
		
		UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
		
		uf.operation(--extrinsicstate);
		
		System.out.println("完成");
		
	}
	
}
