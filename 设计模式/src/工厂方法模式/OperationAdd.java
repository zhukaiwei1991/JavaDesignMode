package 工厂方法模式;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		result = get_numberA() + get_numberB();
		return result;
	}
	
}
