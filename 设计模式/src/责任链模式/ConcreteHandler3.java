package 责任链模式;

public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {

		if(request >= 20 && request < 30){
			
			System.out.println(this.getClass().getName()+"处理请求"+request);
		} else if (successor != null){
			successor.handleRequest(request);
		}
		
	}

}
